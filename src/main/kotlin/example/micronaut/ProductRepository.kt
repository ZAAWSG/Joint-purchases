package example.micronaut

import javax.validation.Valid

interface ProductRepository {

    fun list(): List<Product>

    fun save(@Valid product: Product) 
}