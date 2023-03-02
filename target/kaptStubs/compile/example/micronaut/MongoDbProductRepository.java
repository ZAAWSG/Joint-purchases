package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lexample/micronaut/MongoDbProductRepository;", "Lexample/micronaut/ProductRepository;", "mongoConf", "Lexample/micronaut/MongoDbConfiguration;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "(Lexample/micronaut/MongoDbConfiguration;Lcom/mongodb/client/MongoClient;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lexample/micronaut/Product;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "list", "", "save", "", "product", "micronautguide"})
@jakarta.inject.Singleton
public class MongoDbProductRepository implements example.micronaut.ProductRepository {
    private final example.micronaut.MongoDbConfiguration mongoConf = null;
    private final com.mongodb.client.MongoClient mongoClient = null;
    
    public MongoDbProductRepository(@org.jetbrains.annotations.NotNull
    example.micronaut.MongoDbConfiguration mongoConf, @org.jetbrains.annotations.NotNull
    com.mongodb.client.MongoClient mongoClient) {
        super();
    }
    
    @java.lang.Override
    public void save(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    example.micronaut.Product product) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<example.micronaut.Product> list() {
        return null;
    }
    
    private final com.mongodb.client.MongoCollection<example.micronaut.Product> getCollection() {
        return null;
    }
}