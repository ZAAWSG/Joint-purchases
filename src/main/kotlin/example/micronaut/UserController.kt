package example.micronaut;

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import javax.validation.Valid

@Controller("/users")
@ExecuteOn(TaskExecutors.IO)
open class
UserController(private val userRepository: UserRepository) {

    @Get("/login")
    open fun login(@QueryValue username: String, @QueryValue password: String): UserWithId? {
        val user = userRepository.findByUsernameAndPassword(username, password)
        return if (user != null) UserWithId(user, user.id.toString() ?: "") else null
    }

    @Post
    @Status(HttpStatus.CREATED)
    open fun save(@Body @Valid user: User) =
        userRepository.save(user)

    @Put("/changePassword")
    open fun changePass(@QueryValue username: String, @QueryValue oldPassword: String, @QueryValue newPassword: String): UserWithId?{
        userRepository.changePassword(username,oldPassword, newPassword)
        val user = userRepository.findByUsernameAndPassword(username, newPassword)
        return if (user != null) UserWithId(user, user.id.toString() ?: "") else null
    }
    @Get("/{id}")
    open fun findById(@PathVariable id: String): UserWithId? {
        val user = userRepository.findById(id)
        return if (user != null) UserWithId(user, user.id.toString() ?: "") else null
    }

}