package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\r\u001a\u00020\u0005H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u001a\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0005H&\u00a8\u0006\u0017"}, d2 = {"Lexample/micronaut/ProductRepository;", "", "changeStatus", "", "productId", "", "checkProductStatus", "Lexample/micronaut/Product;", "findById", "findByName", "", "name", "findByType", "productType", "list", "save", "product", "token", "saveUserData", "productName", "quantity", "", "update", "micronautguide"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> list();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.Product product, @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> findByType(@org.jetbrains.annotations.NotNull()
    java.lang.String productType);
    
    @org.jetbrains.annotations.Nullable()
    public abstract example.micronaut.Product findById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    public abstract void changeStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    public abstract void saveUserData(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, int quantity);
    
    @org.jetbrains.annotations.Nullable()
    public abstract example.micronaut.Product checkProductStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
}