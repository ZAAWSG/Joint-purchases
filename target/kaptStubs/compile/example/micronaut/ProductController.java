package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\u0017J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0017J&\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lexample/micronaut/ProductController;", "", "productService", "Lexample/micronaut/ProductRepository;", "(Lexample/micronaut/ProductRepository;)V", "checkStatus", "", "id", "findById", "Lexample/micronaut/Product;", "findByName", "", "name", "findByType", "productType", "list", "save", "", "product", "update", "userId", "quantity", "", "micronautguide"})
@io.micronaut.scheduling.annotation.ExecuteOn(value = "io")
@io.micronaut.http.annotation.Controller(value = "/products")
public class ProductController {
    private final example.micronaut.ProductRepository productService = null;
    
    public ProductController(@org.jetbrains.annotations.NotNull()
    example.micronaut.ProductRepository productService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final java.util.List<example.micronaut.Product> list() {
        return null;
    }
    
    @io.micronaut.http.annotation.Status(value = io.micronaut.http.HttpStatus.CREATED)
    @io.micronaut.http.annotation.Post(value = "/createProduct")
    public void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.Product product) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public example.micronaut.Product update(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String userId, @io.micronaut.http.annotation.QueryValue()
    int quantity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/findByName")
    public java.util.List<example.micronaut.Product> findByName(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/checkProductStatus")
    public java.lang.String checkStatus(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/findByType")
    public java.util.List<example.micronaut.Product> findByType(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String productType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public example.micronaut.Product findById(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id) {
        return null;
    }
}