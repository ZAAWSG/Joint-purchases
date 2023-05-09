package example.micronaut

import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty
import java.time.Instant


data class ChatMessage @BsonCreator constructor(
    @BsonProperty("id") val id: String?,
    @BsonProperty("senderId") val senderId: String,
    @BsonProperty("receiverId") val receiverId: String,
    @BsonProperty("message") val message: String,
    @BsonProperty("sentTime") val sentTime: Instant
){
    constructor(senderId: String, receiverId: String, message: String, sentTime: Instant) : this(null, senderId, receiverId, message, sentTime)
}

