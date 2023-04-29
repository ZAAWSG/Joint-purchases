package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lexample/micronaut/OrderHistory;", "", "()V", "idProduct", "", "productName", "purchaseDate", "orderStatus", "quantityNum", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getIdProduct", "()Ljava/lang/String;", "getOrderStatus", "getProductName", "getPurchaseDate", "getQuantityNum", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "micronautguide"})
public final class OrderHistory {
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "idProduct")
    private final java.lang.String idProduct = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "product_name")
    private final java.lang.String productName = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "purchase_date")
    private final java.lang.String purchaseDate = null;
    @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_status")
    private final java.lang.String orderStatus = null;
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantityNum")
    private final int quantityNum = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final example.micronaut.OrderHistory copy(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "idProduct")
    java.lang.String idProduct, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "product_name")
    java.lang.String productName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "purchase_date")
    java.lang.String purchaseDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_status")
    java.lang.String orderStatus, @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantityNum")
    int quantityNum) {
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
    public OrderHistory(@org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "idProduct")
    java.lang.String idProduct, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "product_name")
    java.lang.String productName, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "purchase_date")
    java.lang.String purchaseDate, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "order_status")
    java.lang.String orderStatus, @org.bson.codecs.pojo.annotations.BsonProperty(value = "quantityNum")
    int quantityNum) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderStatus() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getQuantityNum() {
        return 0;
    }
    
    public OrderHistory() {
        super();
    }
}