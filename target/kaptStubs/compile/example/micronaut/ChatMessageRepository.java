package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lexample/micronaut/ChatMessageRepository;", "", "mongoClient", "Lcom/mongodb/client/MongoClient;", "mongoConf", "Lexample/micronaut/MongoDbConfiguration;", "(Lcom/mongodb/client/MongoClient;Lexample/micronaut/MongoDbConfiguration;)V", "collectionName", "", "findAll", "Lcom/mongodb/client/FindIterable;", "Lexample/micronaut/ChatMessage;", "findBySenderIdAndReceiverId", "senderId", "receiverId", "save", "Lcom/mongodb/client/result/InsertOneResult;", "message", "micronautguide"})
@jakarta.inject.Singleton()
public final class ChatMessageRepository {
    private final com.mongodb.client.MongoClient mongoClient = null;
    private final example.micronaut.MongoDbConfiguration mongoConf = null;
    private final java.lang.String collectionName = "chat_messages";
    
    public ChatMessageRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoClient mongoClient, @org.jetbrains.annotations.NotNull()
    example.micronaut.MongoDbConfiguration mongoConf) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.result.InsertOneResult save(@org.jetbrains.annotations.NotNull()
    example.micronaut.ChatMessage message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.FindIterable<example.micronaut.ChatMessage> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.FindIterable<example.micronaut.ChatMessage> findBySenderIdAndReceiverId(@org.jetbrains.annotations.NotNull()
    java.lang.String senderId, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverId) {
        return null;
    }
}