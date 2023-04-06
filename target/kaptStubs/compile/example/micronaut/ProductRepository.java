package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lexample/micronaut/ProductRepository;", "", "findByName", "", "Lexample/micronaut/Product;", "name", "", "findByType", "productType", "list", "save", "", "product", "micronautguide"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> list();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    example.micronaut.Product product);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<example.micronaut.Product> findByType(@org.jetbrains.annotations.NotNull()
    java.lang.String productType);
}