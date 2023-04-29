package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lexample/micronaut/PaymentInfo;", "", "()V", "creditCardNumber", "", "expirationDate", "cvv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreditCardNumber", "()Ljava/lang/String;", "getCvv", "getExpirationDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "micronautguide"})
public final class PaymentInfo {
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "credit_card_number")
    private final java.lang.String creditCardNumber = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "expiration_date")
    private final java.lang.String expirationDate = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "cvv")
    private final java.lang.String cvv = null;
    
    @org.jetbrains.annotations.NotNull()
    public final example.micronaut.PaymentInfo copy(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "credit_card_number")
    java.lang.String creditCardNumber, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "expiration_date")
    java.lang.String expirationDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "cvv")
    java.lang.String cvv) {
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
    public PaymentInfo(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "credit_card_number")
    java.lang.String creditCardNumber, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "expiration_date")
    java.lang.String expirationDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "cvv")
    java.lang.String cvv) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreditCardNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpirationDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCvv() {
        return null;
    }
    
    public PaymentInfo() {
        super();
    }
}