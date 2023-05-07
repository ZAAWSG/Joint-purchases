package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/TokenConverter;", "", "jwtParser", "Lio/jsonwebtoken/JwtParser;", "(Lio/jsonwebtoken/JwtParser;)V", "convertToken", "Lkotlin/Pair;", "", "token", "micronautguide"})
@jakarta.inject.Singleton()
public final class TokenConverter {
    private final io.jsonwebtoken.JwtParser jwtParser = null;
    
    public TokenConverter(@org.jetbrains.annotations.NotNull()
    io.jsonwebtoken.JwtParser jwtParser) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.String, java.lang.String> convertToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
}