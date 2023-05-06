package example.micronaut

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import io.micronaut.validation.Validated
import jakarta.inject.Singleton
import org.bson.types.ObjectId
import javax.validation.Valid
import com.mongodb.client.model.Filters.*
import com.mongodb.client.model.Updates

@Singleton
open class MongoDbUserRepository(
    private val mongoConf: MongoDbConfiguration,
    private val mongoClient: MongoClient
) : UserRepository {

    override fun save(@Valid user: User) {
        if (collection.countDocuments(eq("email", user.email)) > 0) {
            throw IllegalArgumentException("User with email ${user.email} already exists")
        }
        if (collection.countDocuments(eq("username", user.username)) > 0) {
            throw IllegalArgumentException("User with username ${user.username} already exists")
        }
        collection.insertOne(user)
    }
    override fun findById(userId: String): User? {
        return collection.find(Filters.eq("_id", ObjectId(userId))).firstOrNull()
    }

    override fun changePassword(username: String, oldPassword: String, newPassword: String) {
        val query = Filters.and(
            Filters.eq("username", username),
            Filters.eq("password", oldPassword)
        )
        val update = Updates.set("password", newPassword)
        collection.updateOne(query, update)
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