package example.micronaut;

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import javax.validation.Valid

@Controller("/users")
@ExecuteOn(TaskExecutors.IO)
open class UserController(private val userRepository: UserRepository) {

    @Post
    @Status(HttpStatus.CREATED)
    open fun save(@Body @Valid user: User) =
        userRepository.save(user)
}