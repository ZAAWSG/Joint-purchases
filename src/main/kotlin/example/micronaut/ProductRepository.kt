package example.micronaut

import org.bson.Document
import org.bson.types.ObjectId
import javax.validation.Valid

interface ProductRepository {

    fun list(): List<Product>

    fun save(@Valid product: Product)

    fun findByName(name: String): List<Product>

    fun findByType(productType: String): String

    fun findById(productId: String): Product?

    fun update(productId: String, quantity: Int, userId: String)

    fun changeStatus(productId: String)

    fun saveUserData(userId: String, productId: String, productName: String, quantity: Int)

    fun checkProductStatus(productId: String): Product?
}