package example.micronaut

import java.time.Instant

data class ChatMessage(
    val id: String?,
    val senderId: String,
    val receiverId: String,
    val message: String,
    val sentTime: Instant
)
