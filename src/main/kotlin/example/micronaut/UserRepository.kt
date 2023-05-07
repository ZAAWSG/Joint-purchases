package example.micronaut


import jakarta.inject.Singleton
import org.bson.types.ObjectId
import javax.validation.Valid

@Singleton
interface UserRepository {
    fun findByUsernameAndPassword(username: String, password: String): User?

    fun save(@Valid user: User)

    fun findById(userId: String): User? // Добавленный метод

    fun changePassword(username: String, oldPassword: String, newPassword: String)

    fun findByToken(token: String): User?
}