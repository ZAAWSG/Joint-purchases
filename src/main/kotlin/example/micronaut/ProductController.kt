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

    @Get("/findByName")
    open fun findByName(@QueryValue name: String): List<Product> {
        return productService.findByName(name)
    }

    @Get("/findByType")
    open fun findByType(@QueryValue productType: String): List<Product> {
        return productService.findByType(productType)
    }
}