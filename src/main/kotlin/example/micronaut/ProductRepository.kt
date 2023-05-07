package example.micronaut

import org.bson.Document
import org.bson.types.ObjectId
import javax.validation.Valid

interface ProductRepository {

    fun list(): List<Product>

    fun save(@Valid product: Product, token: String)

    fun findByName(name: String): List<Product>

    fun findByType(productType: String): List<Product>

    fun findById(productId: String): Product?

    fun update(productId: String, quantity: Int, token: String)

    fun changeStatus(productId: String)

    fun saveUserData(token: String, productId: String, productName: String, quantity: Int)

    fun checkProductStatus(productId: String): Product?
}