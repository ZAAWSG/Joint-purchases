package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lexample/micronaut/ProductClient;", "", "findAll", "", "Lexample/micronaut/Product;", "save", "Lio/micronaut/http/HttpStatus;", "product", "micronautguide"})
@io.micronaut.http.client.annotation.Client(value = "/products")
public abstract interface ProductClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post
    public abstract io.micronaut.http.HttpStatus save(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    example.micronaut.Product product);
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get
    public abstract java.util.List<example.micronaut.Product> findAll();
}