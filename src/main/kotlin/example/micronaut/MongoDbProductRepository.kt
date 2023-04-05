package example.micronaut

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import jakarta.inject.Singleton
import javax.validation.Valid

@Singleton 
open class MongoDbProductRepository(
    private val mongoConf: MongoDbConfiguration,  
    private val mongoClient: MongoClient) : ProductRepository { 

    override fun save(@Valid product: Product) {
        collection.insertOne(product)
    }

    override fun list(): List<Product> = collection.find().into(ArrayList())

    private val collection: MongoCollection<Product>
        get() = mongoClient.getDatabase(mongoConf.name)
                .getCollection("products", Product::class.java)
}