package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/FruitControllerValidationTest;", "", "httpClient", "Lio/micronaut/http/client/HttpClient;", "(Lio/micronaut/http/client/HttpClient;)V", "getHttpClient", "()Lio/micronaut/http/client/HttpClient;", "testFruitIsValidated", "", "micronautguide"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest
@io.micronaut.context.annotation.Property(name = "spec.name", value = "FruitControllerValidationTest")
public final class FruitControllerValidationTest {
    @org.jetbrains.annotations.NotNull
    private final io.micronaut.http.client.HttpClient httpClient = null;
    
    public FruitControllerValidationTest(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.client.annotation.Client(value = "/")
    io.micronaut.http.client.HttpClient httpClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.http.client.HttpClient getHttpClient() {
        return null;
    }
    
    @org.junit.jupiter.api.Test
    public final void testFruitIsValidated() {
    }
}