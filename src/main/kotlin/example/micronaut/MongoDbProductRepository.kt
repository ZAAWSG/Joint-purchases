package example.micronaut

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import com.mongodb.client.model.Projections
import com.mongodb.client.model.Updates
import jakarta.inject.Singleton
import org.bson.Document
import org.bson.types.ObjectId
import java.time.LocalDate
import javax.validation.Valid

@Singleton
open class MongoDbProductRepository(
    private val mongoConf: MongoDbConfiguration,
    private val mongoClient: MongoClient,
    private val userRepository: UserRepository) : ProductRepository {

    override fun save(@Valid product: Product) {
        val creatorInfo = userRepository.findById(product.creator)

        if (creatorInfo?.organizer != true) {
            throw RuntimeException("User is not authorized to create products")
        }

        collection.insertOne(product)
    }
    override fun update(productId: String, quantity: Int, userId: String) {
//        val creatorInfo = userRepository.findById(userId)
//            ?: throw RuntimeException("User is not founded")

        val query = Filters.eq("_id", ObjectId(productId))
        val update = Updates.combine(
            Updates.inc("acceptQuantity", -quantity),
            Updates.push("users_id", UserInfo(ObjectId(userId), LocalDate.now().toString(), quantity))
        )
        collection.updateOne(query, update)
    }
    override fun changeStatus(productId: String) {
        val query = Filters.eq("_id", ObjectId(productId))
        val update = Updates.set("status", "close")
        collection.updateOne(query, update)
    }

    override fun saveUserData(userId: String, productId: String, productName: String, quantity: Int) {
        val query = Filters.eq("_id", ObjectId(userId))
        val update = Updates.push("order_history", OrderHistory(productId, productName, LocalDate.now().toString(), "Open",quantity))
        mongoClient.getDatabase(mongoConf.name).getCollection("users").updateMany(query, update)
    }

    override fun checkProductStatus(productId: String): Product? {
        return collection.find(Filters.eq("_id", ObjectId(productId))).firstOrNull()
    }
    override fun list(): List<Product> = collection.find().into(ArrayList())

    override fun findByName(name: String): List<Product> {
        val regex = ".*${name}.*"
        val query = Document("name", Document("\$regex", regex))
        return collection.find(query).toList()
    }

    override fun findByType(productType: String): List<Product> {
        val query = Document("productType", productType)
        return collection.find(query).toList()
    }

    override fun findById(productId: String): Product? {
        return collection.find(Filters.eq("_id", ObjectId(productId))).firstOrNull()
    }

    private val collection: MongoCollection<Product>
        get() = mongoClient.getDatabase(mongoConf.name)
                .getCollection("products", Product::class.java)
}