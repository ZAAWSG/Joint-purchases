package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lexample/micronaut/Product;", "", "name", "", "(Ljava/lang/String;)V", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "micronautguide"})
@io.micronaut.serde.annotation.Serdeable
public final class Product {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    private java.lang.String description;
    
    @org.jetbrains.annotations.NotNull
    public final example.micronaut.Product copy(@org.jetbrains.annotations.NotNull
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    java.lang.String description) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.bson.codecs.pojo.annotations.BsonCreator
    @io.micronaut.core.annotation.Creator
    public Product(@org.jetbrains.annotations.NotNull
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public Product(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
}