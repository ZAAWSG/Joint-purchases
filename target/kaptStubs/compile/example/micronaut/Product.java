package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010&\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0004H\u00c6\u0003J\t\u0010(\u001a\u00020\u0004H\u00c6\u0003J\t\u0010)\u001a\u00020\u0004H\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Ju\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u000bH\u00d6\u0001J\t\u00102\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lexample/micronaut/Product;", "", "()V", "name", "", "description", "creator", "productType", "createdDate", "deadlineDate", "quantity", "", "price", "", "users", "", "Lexample/micronaut/UserInfo;", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/util/List;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "getCreator", "getDeadlineDate", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getName", "getPrice", "()D", "getProductType", "getQuantity", "()I", "getStatus", "getUsers", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "micronautguide"})
@io.micronaut.core.annotation.Introspected()
public final class Product {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "creator")
    private final java.lang.String creator = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "productType")
    private final java.lang.String productType = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "created_date")
    private final java.lang.String createdDate = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "deadline_date")
    private final java.lang.String deadlineDate = null;
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantity")
    private final int quantity = 0;
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "price")
    private final double price = 0.0;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "users_id")
    private final java.util.List<example.micronaut.UserInfo> users = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "status")
    private final java.lang.String status = null;
    
    @org.jetbrains.annotations.NotNull()
    public final example.micronaut.Product copy(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "creator")
    java.lang.String creator, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "productType")
    java.lang.String productType, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "created_date")
    java.lang.String createdDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "deadline_date")
    java.lang.String deadlineDate, @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantity")
    int quantity, @org.bson.codecs.pojo.annotations.BsonProperty(value = "price")
    double price, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "users_id")
    java.util.List<example.micronaut.UserInfo> users, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "status")
    java.lang.String status) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.bson.codecs.pojo.annotations.BsonCreator()
    public Product(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "description")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "creator")
    java.lang.String creator, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "productType")
    java.lang.String productType, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "created_date")
    java.lang.String createdDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "deadline_date")
    java.lang.String deadlineDate, @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantity")
    int quantity, @org.bson.codecs.pojo.annotations.BsonProperty(value = "price")
    double price, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "users_id")
    java.util.List<example.micronaut.UserInfo> users, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "status")
    java.lang.String status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeadlineDate() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.UserInfo> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.UserInfo> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public Product() {
        super();
    }
}