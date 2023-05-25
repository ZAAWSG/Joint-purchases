package example.micronaut

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.http.annotation.*
import io.micronaut.http.exceptions.HttpStatusException
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import javax.validation.Valid
import com.google.cloud.storage.BlobId
import com.google.cloud.storage.BlobInfo
import com.google.cloud.storage.Storage
import com.google.cloud.storage.StorageOptions
import java.io.File


@Controller("/products") 
@ExecuteOn(TaskExecutors.IO)
@Secured(SecurityRule.IS_ANONYMOUS)
open class ProductController(private val productService: ProductRepository) {

    @Get
    fun list(): List<ProductWithId> {
        val products = productService.list()
        return products.map { ProductWithId(it, it.id.toString()) }
    }
    @Post ("/createProduct")
    @Status(CREATED)
    open fun save(@Header("Authorization") authorization: String, @Body @Valid product: Product, @QueryValue file_path: String) {
        val token = getTokenFromAuthorizationHeader(authorization)

        val bucketName = "joint-purchase-386115.appspot.com"
        val objectName = product.name + ".jpg"
        val storage = StorageOptions.getDefaultInstance().service
        val blobId = BlobId.of(bucketName, objectName)
        val blobInfo = BlobInfo.newBuilder(blobId).setContentType("image/jpeg").build()
        val precondition: Storage.BlobWriteOption
        if (storage.get(bucketName, objectName) == null) {
            precondition = Storage.BlobWriteOption.doesNotExist()
        } else {
            precondition =
                Storage.BlobWriteOption.generationMatch(
                    storage.get(bucketName, objectName).generation)
        }

        val file = File(file_path)
        storage.create(blobInfo, file.inputStream(), precondition)
        val imageUrl = "https://storage.googleapis.com/joint-purchase-386115.appspot.com/" + objectName
        val productWithImage = product.copy(urlImage = imageUrl)

        productService.save(productWithImage, token)
    }

    @Put("/{id}")
    open fun update(@PathVariable id: String, @Header("Authorization") authorization: String, @QueryValue quantity: Int): Product {
        val token = getTokenFromAuthorizationHeader(authorization)
        val product = productService.findById(id) ?: throw RuntimeException("Product not found")
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val date = formatter.parse(product.deadlineDate)
        val localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.time), ZoneId.systemDefault())

        if (product.acceptQuantity < quantity) {
            throw HttpStatusException(HttpStatus.NOT_FOUND, "Not enough stock available.")
        }
        try {
            if(product.acceptQuantity - quantity == 0){
                productService.changeStatus(id)
            }
        } catch (e: DateTimeParseException) {
            throw RuntimeException("Invalid deadline date format")
        }
        productService.saveUserData(token, id,product.name, quantity, product.urlImage.toString())
        productService.update(id, quantity, token)

        return productService.findById(id) ?: throw RuntimeException("Product not found")
    }

    @Get("/findByName")
    open fun findByName(@QueryValue name: String): List<ProductWithId> {
        val products = productService.findByName(name)
        return products.map { ProductWithId(it, it.id.toString()) }
    }
    @Get("/checkProductStatus")
    open fun checkStatus(@QueryValue id: String): String? {
        return productService.checkProductStatus(id)?.let { it.status }
    }

    @Get("/findByType")
    open fun findByType(@QueryValue productType: String): List<ProductWithId> {
        val products = productService.findByType(productType)
        return products.map { ProductWithId(it, it.id.toString()) }
    }

    @Get("/{id}")
    open fun findById(@PathVariable id: String): Product? {
        return productService.findById(id)
    }

    private fun getTokenFromAuthorizationHeader(authorization: String): String {
        if (!authorization.startsWith("Bearer ")) {
            throw IllegalArgumentException("Invalid authorization header")
        }
        return authorization.substring("Bearer ".length).trim()
    }




}