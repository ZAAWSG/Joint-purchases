package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u007f\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013\u00a8\u00060"}, d2 = {"Lexample/micronaut/User;", "", "()V", "id", "Lorg/bson/types/ObjectId;", "username", "", "password", "email", "firstName", "lastName", "phoneNumber", "paymentInfo", "", "Lexample/micronaut/OrderHistory;", "orderHistory", "roles", "(Lorg/bson/types/ObjectId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "getFirstName", "getId", "()Lorg/bson/types/ObjectId;", "getLastName", "getOrderHistory", "()Ljava/util/List;", "getPassword", "getPaymentInfo", "getPhoneNumber", "getRoles", "getUsername", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "micronautguide"})
@io.micronaut.core.annotation.Introspected()
public final class User {
    @org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "id", useDiscriminator = false)
    private final org.bson.types.ObjectId id = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "username")
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "password")
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "first_name")
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "last_name")
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "phone_number")
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "payment_info")
    private final java.util.List<example.micronaut.OrderHistory> paymentInfo = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_history")
    private final java.util.List<example.micronaut.OrderHistory> orderHistory = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "roles")
    private final java.util.List<java.lang.String> roles = null;
    
    @org.jetbrains.annotations.NotNull()
    public final example.micronaut.User copy(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "_id")
    org.bson.types.ObjectId id, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "first_name")
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "last_name")
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "phone_number")
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "payment_info")
    java.util.List<example.micronaut.OrderHistory> paymentInfo, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_history")
    java.util.List<example.micronaut.OrderHistory> orderHistory, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "roles")
    java.util.List<java.lang.String> roles) {
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
    public User(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "_id")
    org.bson.types.ObjectId id, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "first_name")
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "last_name")
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "phone_number")
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "payment_info")
    java.util.List<example.micronaut.OrderHistory> paymentInfo, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_history")
    java.util.List<example.micronaut.OrderHistory> orderHistory, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "roles")
    java.util.List<java.lang.String> roles) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.bson.types.ObjectId component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.OrderHistory> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.OrderHistory> getPaymentInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.OrderHistory> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<example.micronaut.OrderHistory> getOrderHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRoles() {
        return null;
    }
    
    public User() {
        super();
    }
}