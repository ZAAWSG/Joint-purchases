package example.micronaut

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import jakarta.inject.Singleton
import org.bson.Document
import javax.validation.Valid

@Singleton
open class MongoDbProductRepository(
    private val mongoConf: MongoDbConfiguration,
    private val mongoClient: MongoClient) : ProductRepository {

    override fun save(@Valid product: Product) {
        collection.insertOne(product)
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

    private val collection: MongoCollection<Product>
        get() = mongoClient.getDatabase(mongoConf.name)
                .getCollection("products", Product::class.java)


}