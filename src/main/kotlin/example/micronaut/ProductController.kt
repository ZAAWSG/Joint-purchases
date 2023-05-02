package example.micronaut

import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import javax.validation.Valid

@Controller("/products") 
@ExecuteOn(TaskExecutors.IO) 
open class ProductController(private val productService: ProductRepository) { 

    @Get 
    fun list(): List<Product> = productService.list()

    @Post ("/createProduct")
    @Status(CREATED) 
    open fun save(@Valid product: Product) =
        productService.save(product)

    @Put("/{id}")
    open fun update(@PathVariable id: String, @QueryValue userId:String, @QueryValue quantity: Int): Product {
        val product = productService.findById(id) ?: throw RuntimeException("Product not found")
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val date = formatter.parse(product.deadlineDate)
        val localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.time), ZoneId.systemDefault())

        if (product.acceptQuantity < quantity) {
            throw RuntimeException("Not enough stock available")
        }
        try {
            if(product.acceptQuantity - quantity == 0 || localDateTime > LocalDateTime.now()){
                productService.changeStatus(id)
            }
        } catch (e: DateTimeParseException) {
            throw RuntimeException("Invalid deadline date format")
        }
        productService.saveUserData(userId, id,product.name, quantity)
        productService.update(id, quantity, userId)

        return productService.findById(id) ?: throw RuntimeException("Product not found")
    }

    @Get("/findByName")
    open fun findByName(@QueryValue name: String): List<Product> {
        return productService.findByName(name)
    }
    @Get("/checkProductStatus")
    open fun checkStatus(@QueryValue id: String): String? {
        return productService.checkProductStatus(id)?.let { it.status }
    }

    @Get("/findByType")
    open fun findByType(@QueryValue productType: String): List<Product> {
        return productService.findByType(productType)
    }

    @Get("/{id}")
    open fun findById(@PathVariable id: String): Product? {
        return productService.findById(id)
    }




}