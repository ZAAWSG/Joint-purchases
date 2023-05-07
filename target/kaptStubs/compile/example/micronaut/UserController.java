package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH\u0017J\u0014\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\nH\u0017J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0010\u001a\u00020\nH\u0017J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0016\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lexample/micronaut/UserController;", "", "userRepository", "Lexample/micronaut/UserRepository;", "tokenService", "Lexample/micronaut/TokenService;", "(Lexample/micronaut/UserRepository;Lexample/micronaut/TokenService;)V", "changePass", "Lexample/micronaut/UserWithId;", "username", "", "oldPassword", "newPassword", "findById", "id", "findByToken", "authorization", "getTokenFromAuthorizationHeader", "login", "Lio/micronaut/http/MutableHttpResponse;", "credentials", "Lio/micronaut/security/authentication/UsernamePasswordCredentials;", "save", "user", "Lexample/micronaut/User;", "micronautguide"})
@io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
@io.micronaut.scheduling.annotation.ExecuteOn(value = "io")
@io.micronaut.http.annotation.Controller(value = "/users")
public class UserController {
    private final example.micronaut.UserRepository userRepository = null;
    private final example.micronaut.TokenService tokenService = null;
    
    public UserController(@org.jetbrains.annotations.NotNull()
    example.micronaut.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    example.micronaut.TokenService tokenService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
    @io.micronaut.http.annotation.Post(value = "/login")
    public io.micronaut.http.MutableHttpResponse<?> login(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    io.micronaut.security.authentication.UsernamePasswordCredentials credentials) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Status(value = io.micronaut.http.HttpStatus.CREATED)
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.MutableHttpResponse<java.lang.Object> save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    example.micronaut.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Put(value = "/changePassword")
    public example.micronaut.UserWithId changePass(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String newPassword) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public example.micronaut.UserWithId findById(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/findByToken")
    public example.micronaut.UserWithId findByToken(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Header(value = "Authorization")
    java.lang.String authorization) {
        return null;
    }
    
    private final java.lang.String getTokenFromAuthorizationHeader(java.lang.String authorization) {
        return null;
    }
}