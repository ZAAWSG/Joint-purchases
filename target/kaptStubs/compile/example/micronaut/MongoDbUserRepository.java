package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\tH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lexample/micronaut/MongoDbUserRepository;", "Lexample/micronaut/UserRepository;", "mongoConf", "Lexample/micronaut/MongoDbConfiguration;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "(Lexample/micronaut/MongoDbConfiguration;Lcom/mongodb/client/MongoClient;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lexample/micronaut/User;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "changePassword", "", "username", "", "oldPassword", "newPassword", "findById", "userId", "findByUsernameAndPassword", "password", "save", "user", "micronautguide"})
@jakarta.inject.Singleton()
public class MongoDbUserRepository implements example.micronaut.UserRepository {
    private final example.micronaut.MongoDbConfiguration mongoConf = null;
    private final com.mongodb.client.MongoClient mongoClient = null;
    
    public MongoDbUserRepository(@org.jetbrains.annotations.NotNull()
    example.micronaut.MongoDbConfiguration mongoConf, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoClient mongoClient) {
        super();
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.User user) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public example.micronaut.User findById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @java.lang.Override()
    public void changePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public example.micronaut.User findByUsernameAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private final com.mongodb.client.MongoCollection<example.micronaut.User> getCollection() {
        return null;
    }
}