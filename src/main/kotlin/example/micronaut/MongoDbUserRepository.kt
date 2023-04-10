package example.micronaut

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import io.micronaut.validation.Validated
import jakarta.inject.Singleton
import org.bson.types.ObjectId
import javax.validation.Valid
import com.mongodb.client.model.Filters.*

@Singleton
open class MongoDbUserRepository(
    private val mongoConf: MongoDbConfiguration,
    private val mongoClient: MongoClient
) : UserRepository {

    override fun save(@Valid user: User) {
        if (collection.countDocuments(eq("email", user.email)) > 0) {
            throw IllegalArgumentException("User with email ${user.email} already exists")
        }
        collection.insertOne(user)
    }
    override fun findById(userId: String): User? {
        return collection.find(Filters.eq("_id", ObjectId(userId))).firstOrNull()
    }

    override fun findByUsernameAndPassword(username: String, password: String): User? {
        return collection.find(
            and(
                eq("username", username),
                eq("password", password)
            )
        ).firstOrNull()
    }

    private val collection: MongoCollection<User>
        get() = mongoClient.getDatabase(mongoConf.name)
            .getCollection("users", User::class.java)
}