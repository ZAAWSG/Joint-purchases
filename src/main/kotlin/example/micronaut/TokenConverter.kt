package example.micronaut

import io.jsonwebtoken.JwtParser
import jakarta.inject.Singleton

@Singleton
class TokenConverter(private val jwtParser: JwtParser) {

    fun convertToken(token: String): Pair<String, String>? {
        val claims = jwtParser.parseClaimsJws(token).body
        val username = claims.get("sub", String::class.java)
        val roles = claims.get("roles", String::class.java)
        return if (username != null && roles != null) Pair(username, roles) else null
    }
}