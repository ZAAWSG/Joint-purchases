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
    open fun login(@QueryValue username: String, @QueryValue password: String): User? {
        return userRepository.findByUsernameAndPassword(username, password)
    }

    @Post
    @Status(HttpStatus.CREATED)
    open fun save(@Body @Valid user: User) =
        userRepository.save(user)

    @Put("/changePassword")
    open fun changePass(@QueryValue username: String, @QueryValue oldPassword: String, @QueryValue newPassword: String): User?{
        userRepository.changePassword(username,oldPassword, newPassword)
        return userRepository.findByUsernameAndPassword(username, newPassword)
    }
}