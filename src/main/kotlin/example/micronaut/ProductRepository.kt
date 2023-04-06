package example.micronaut

import javax.validation.Valid

interface ProductRepository {

    fun list(): List<Product>

    fun save(@Valid product: Product)

    fun findByName(name: String): List<Product>

    fun findByType(productType: String): List<Product>
}