package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0007J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0007J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lexample/micronaut/ChatWebSocket;", "", "broadcaster", "Lio/micronaut/websocket/WebSocketBroadcaster;", "chatMessageRepository", "Lexample/micronaut/ChatMessageRepository;", "(Lio/micronaut/websocket/WebSocketBroadcaster;Lexample/micronaut/ChatMessageRepository;)V", "isValid", "Ljava/util/function/Predicate;", "Lio/micronaut/websocket/WebSocketSession;", "id1", "", "id2", "log", "", "event", "session", "onClose", "Lorg/reactivestreams/Publisher;", "onMessage", "message", "onOpen", "Companion", "micronautguide"})
@io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
@io.micronaut.websocket.annotation.ServerWebSocket(value = "/ws/chat/{id1}/{id2}")
public final class ChatWebSocket {
    private final io.micronaut.websocket.WebSocketBroadcaster broadcaster = null;
    private final example.micronaut.ChatMessageRepository chatMessageRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final example.micronaut.ChatWebSocket.Companion Companion = null;
    private static final org.slf4j.Logger LOG = null;
    
    public ChatWebSocket(@org.jetbrains.annotations.NotNull()
    io.micronaut.websocket.WebSocketBroadcaster broadcaster, @org.jetbrains.annotations.NotNull()
    example.micronaut.ChatMessageRepository chatMessageRepository) {
        super();
    }
    
    private final void log(java.lang.String event, io.micronaut.websocket.WebSocketSession session, java.lang.String id1, java.lang.String id2) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.websocket.annotation.OnOpen()
    public final org.reactivestreams.Publisher<java.lang.String> onOpen(@org.jetbrains.annotations.NotNull()
    java.lang.String id1, @org.jetbrains.annotations.NotNull()
    java.lang.String id2, @org.jetbrains.annotations.NotNull()
    io.micronaut.websocket.WebSocketSession session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.websocket.annotation.OnMessage()
    public final org.reactivestreams.Publisher<java.lang.String> onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id1, @org.jetbrains.annotations.NotNull()
    java.lang.String id2, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    io.micronaut.websocket.WebSocketSession session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.websocket.annotation.OnClose()
    public final org.reactivestreams.Publisher<java.lang.String> onClose(@org.jetbrains.annotations.NotNull()
    java.lang.String id1, @org.jetbrains.annotations.NotNull()
    java.lang.String id2, @org.jetbrains.annotations.NotNull()
    io.micronaut.websocket.WebSocketSession session) {
        return null;
    }
    
    private final java.util.function.Predicate<io.micronaut.websocket.WebSocketSession> isValid(java.lang.String id1, java.lang.String id2) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lexample/micronaut/ChatWebSocket$Companion;", "", "()V", "LOG", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "micronautguide"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}