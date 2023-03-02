package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/MockFruitRepository;", "Lexample/micronaut/FruitRepository;", "()V", "list", "", "Lexample/micronaut/Fruit;", "save", "", "fruit", "micronautguide"})
@io.micronaut.context.annotation.Replaces(value = example.micronaut.FruitRepository.class)
@jakarta.inject.Singleton
@io.micronaut.context.annotation.Requires(property = "spec.name", value = "FruitControllerValidationTest")
public final class MockFruitRepository implements example.micronaut.FruitRepository {
    
    public MockFruitRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<example.micronaut.Fruit> list() {
        return null;
    }
    
    @java.lang.Override
    public void save(@org.jetbrains.annotations.NotNull
    example.micronaut.Fruit fruit) {
    }
}