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
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import io.micronaut.security.token.jwt.converters.JWEAlgorithmConverter
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

    override fun findByToken(token: String): User? {
        val kuka = Jwts.parserBuilder().setSigningKey("b5059f33746a279c0cf6304f550b4642a0a7ae42cd7dc13db7710d4207e8f254").build().parse(token).body as Map<String, Any>
        val username = kuka.getValue("sub").toString()
        val password = kuka.getValue("roles").toString()
        return collection.find(Filters.and(Filters.eq("username", username), Filters.eq("password", password))).firstOrNull()

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