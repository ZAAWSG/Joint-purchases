package example.micronaut

import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import javax.validation.Valid

@Controller("/products") 
@ExecuteOn(TaskExecutors.IO) 
open class ProductController(private val productService: ProductRepository) { 

    @Get 
    fun list(): List<Product> = productService.list()

    @Post 
    @Status(CREATED) 
    open fun save(@Valid product: Product) =
        productService.save(product)

    @Put("/{id}")
    open fun update(@PathVariable id: String, @QueryValue userId:String, @QueryValue quantity: Int): Product {
        val product = productService.findById(id) ?: throw RuntimeException("Product not found")

        if (product.acceptQuantity < quantity) {
            throw RuntimeException("Not enough stock available")
        }
        if(product.acceptQuantity - quantity == 0){
            productService.changeStatus(id)
        }
        productService.saveUserData(userId, id,product.name, quantity)
        productService.update(id, quantity, userId)

        return product
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
    open fun findByType(@QueryValue productType: String): String {
        return productService.findByType(productType)
    }

    @Get("/{id}")
    open fun findById(@PathVariable id: String): Product? {
        return productService.findById(id)
    }

    @Post("/{id}")
    open fun buyProduct(@PathVariable id: String, @QueryValue userId: String, @QueryValue quantity: Int): String {
        val product = productService.findById(id) ?: throw RuntimeException("Product not found")

        if (product.acceptQuantity < quantity) {
            throw RuntimeException("Not enough stock available")
        }

        product.acceptQuantity -= quantity
        productService.save(product)

        return "success"
    }


}