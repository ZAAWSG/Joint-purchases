package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u000f"}, d2 = {"Lexample/micronaut/UserRepository;", "", "changePassword", "", "username", "", "oldPassword", "newPassword", "findById", "Lexample/micronaut/User;", "userId", "findByUsernameAndPassword", "password", "save", "user", "micronautguide"})
@jakarta.inject.Singleton()
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract example.micronaut.User findByUsernameAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.User user);
    
    @org.jetbrains.annotations.Nullable()
    public abstract example.micronaut.User findById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    public abstract void changePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword);
}