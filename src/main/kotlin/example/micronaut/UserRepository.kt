package example.micronaut


import jakarta.inject.Singleton
import javax.validation.Valid

@Singleton
interface UserRepository {

    fun save(@Valid user: User)
}