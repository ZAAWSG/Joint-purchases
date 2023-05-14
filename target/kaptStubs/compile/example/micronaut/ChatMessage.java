package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nBO\b\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lexample/micronaut/ChatMessage;", "", "senderId", "", "receiverId", "message", "sentTime", "Ljava/time/Instant;", "referredMessageId", "referredMessageText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMessage", "getReceiverId", "getReferredMessageId", "getReferredMessageText", "getSenderId", "getSentTime", "()Ljava/time/Instant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "micronautguide"})
public final class ChatMessage {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String senderId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String receiverId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Instant sentTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String referredMessageId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String referredMessageText = null;
    
    @org.jetbrains.annotations.NotNull()
    public final example.micronaut.ChatMessage copy(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "senderId")
    java.lang.String senderId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "receiverId")
    java.lang.String receiverId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "sentTime")
    java.time.Instant sentTime, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "referredMessageId")
    java.lang.String referredMessageId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "referredMessageText")
    java.lang.String referredMessageText) {
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
    public ChatMessage(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "senderId")
    java.lang.String senderId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "receiverId")
    java.lang.String receiverId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "sentTime")
    java.time.Instant sentTime, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "referredMessageId")
    java.lang.String referredMessageId, @org.jetbrains.annotations.NotNull()
    @org.bson.codecs.pojo.annotations.BsonProperty(value = "referredMessageText")
    java.lang.String referredMessageText) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSenderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiverId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant getSentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferredMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferredMessageText() {
        return null;
    }
    
    public ChatMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String senderId, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.time.Instant sentTime, @org.jetbrains.annotations.NotNull()
    java.lang.String referredMessageId, @org.jetbrains.annotations.NotNull()
    java.lang.String referredMessageText) {
        super();
    }
}