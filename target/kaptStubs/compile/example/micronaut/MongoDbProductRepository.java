package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u000bH\u0016J(\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lexample/micronaut/MongoDbProductRepository;", "Lexample/micronaut/ProductRepository;", "mongoConf", "Lexample/micronaut/MongoDbConfiguration;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "userRepository", "Lexample/micronaut/UserRepository;", "(Lexample/micronaut/MongoDbConfiguration;Lcom/mongodb/client/MongoClient;Lexample/micronaut/UserRepository;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lexample/micronaut/Product;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "changeStatus", "", "productId", "", "checkProductStatus", "findById", "findByName", "", "name", "findByType", "productType", "list", "save", "product", "saveUserData", "userId", "productName", "quantity", "", "update", "micronautguide"})
@jakarta.inject.Singleton()
public class MongoDbProductRepository implements example.micronaut.ProductRepository {
    private final example.micronaut.MongoDbConfiguration mongoConf = null;
    private final com.mongodb.client.MongoClient mongoClient = null;
    private final example.micronaut.UserRepository userRepository = null;
    
    public MongoDbProductRepository(@org.jetbrains.annotations.NotNull()
    example.micronaut.MongoDbConfiguration mongoConf, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoClient mongoClient, @org.jetbrains.annotations.NotNull()
    example.micronaut.UserRepository userRepository) {
        super();
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.Product product) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void changeStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    @java.lang.Override()
    public void saveUserData(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, int quantity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public example.micronaut.Product checkProductStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<example.micronaut.Product> list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<example.micronaut.Product> findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<example.micronaut.Product> findByType(@org.jetbrains.annotations.NotNull()
    java.lang.String productType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public example.micronaut.Product findById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
        return null;
    }
    
    private final com.mongodb.client.MongoCollection<example.micronaut.Product> getCollection() {
        return null;
    }
}