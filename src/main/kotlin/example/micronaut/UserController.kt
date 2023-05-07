package example.micronaut;

import io.jsonwebtoken.Jwts
import io.micronaut.http.HttpHeaders
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import io.micronaut.security.annotation.Secured
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.rules.SecurityRule
import org.slf4j.LoggerFactory
import javax.validation.Valid
private val logger = LoggerFactory.getLogger(UserController::class.java)
@Controller("/users")
@ExecuteOn(TaskExecutors.IO)
@Secured(SecurityRule.IS_ANONYMOUS)
open class
UserController(private val userRepository: UserRepository, private val tokenService: TokenService) {

    @Post("/login")
    @Secured(SecurityRule.IS_ANONYMOUS)
    open fun login(@Body credentials: UsernamePasswordCredentials): MutableHttpResponse<*> {
        val user = userRepository.findByUsernameAndPassword(credentials.username, credentials.password)
        print(user)
        if (user == null) {
            return HttpResponse.status<Any?>(HttpStatus.UNAUTHORIZED)
        } else {
            val token = tokenService.generateToken(credentials)?.orElse(null)
            if (token != null) {
                return HttpResponse.ok<Any?>().header(HttpHeaders.AUTHORIZATION, "Bearer $token").body(token)
            } else {
                return HttpResponse.serverError<Any?>().body("Failed to generate token")
            }
        }
    }


    @Post
    @Status(HttpStatus.CREATED)
    open fun save(@Body @Valid user: User): MutableHttpResponse<Any> {
        userRepository.save(user)
        val authentication = UsernamePasswordCredentials(user.username, user.password)
        val token = tokenService.generateToken(authentication)?.orElse(null)
        return if (token != null) {
            HttpResponse.ok<Any>().header(HttpHeaders.AUTHORIZATION, "Bearer $token").body(token)
        } else {
            HttpResponse.serverError<Any?>().body("Failed to generate token")
        }
    }

    @Put("/changePassword")
    open fun changePass(@QueryValue username: String, @QueryValue oldPassword: String, @QueryValue newPassword: String): UserWithId?{
        userRepository.changePassword(username,oldPassword, newPassword)
        val user = userRepository.findByUsernameAndPassword(username, newPassword)
        return if (user != null) UserWithId(user, user.id.toString()) else null
    }
    @Get("/{id}")
    open fun findById(@PathVariable id: String): UserWithId? {
        val user = userRepository.findById(id)
        return if (user != null) UserWithId(user, user.id.toString()) else null
    }

    @Get("/findByToken")
    open fun findByToken(@Header("Authorization") authorization: String): UserWithId? {
        val token = getTokenFromAuthorizationHeader(authorization)
        val user = userRepository.findByToken(token)
        return if (user != null) UserWithId(user, user.id.toString()) else null
    }

    private fun getTokenFromAuthorizationHeader(authorization: String): String {
        if (!authorization.startsWith("Bearer ")) {
            throw IllegalArgumentException("Invalid authorization header")
        }
        return authorization.substring("Bearer ".length).trim()
    }

}