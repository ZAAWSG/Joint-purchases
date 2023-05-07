package example.micronaut

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import io.micronaut.security.authentication.Authentication
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.cookie.JwtCookieTokenReader
import io.micronaut.security.token.jwt.generator.JwtTokenGenerator
import io.micronaut.security.token.reader.TokenReader
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import java.util.*


private val logger = LoggerFactory.getLogger(TokenService::class.java)
@Singleton
class TokenService(private val jwtGenerator: JwtTokenGenerator) {
    fun generateToken(authentication: UsernamePasswordCredentials): Optional<String>? {
        val username = authentication.username
        val roles = authentication.password
        logger.info("Generating token for user $username with roles $roles")
        val token = jwtGenerator.generateToken(mapOf("sub" to username, "roles" to roles))
        if (token.isPresent) {
            logger.info("Token generated successfully: ${token.get()}")
        } else {
            logger.error("Failed to generate token")
        }
        return token
    }
}