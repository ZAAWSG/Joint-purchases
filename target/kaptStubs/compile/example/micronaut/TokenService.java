package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lexample/micronaut/TokenService;", "", "jwtGenerator", "Lio/micronaut/security/token/jwt/generator/JwtTokenGenerator;", "(Lio/micronaut/security/token/jwt/generator/JwtTokenGenerator;)V", "generateToken", "Ljava/util/Optional;", "", "authentication", "Lio/micronaut/security/authentication/UsernamePasswordCredentials;", "micronautguide"})
@jakarta.inject.Singleton()
public final class TokenService {
    private final io.micronaut.security.token.jwt.generator.JwtTokenGenerator jwtGenerator = null;
    
    public TokenService(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.token.jwt.generator.JwtTokenGenerator jwtGenerator) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Optional<java.lang.String> generateToken(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.authentication.UsernamePasswordCredentials authentication) {
        return null;
    }
}