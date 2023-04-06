package example.micronaut


import jakarta.inject.Singleton
import javax.validation.Valid

@Singleton
interface UserRepository {
    fun findByUsernameAndPassword(username: String, password: String): User?

    fun save(@Valid user: User)
}