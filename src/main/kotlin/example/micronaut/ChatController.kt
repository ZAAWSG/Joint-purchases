package example.micronaut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import java.time.Instant

@Controller("/chat")
@ExecuteOn(TaskExecutors.IO)
@Secured(SecurityRule.IS_ANONYMOUS)
open class
ChatController(private val chatMessageRepository: ChatMessageRepository) {
    @Get("/{id1}/{id2}")
    open fun checkMessages(@PathVariable id1: String, @PathVariable id2: String): List<ChatMessage> {
        return chatMessageRepository.findBySenderIdAndReceiverId(id1, id2).toList()
    }
    @Get("/{id}")
    open fun getLastMessagesWithContacts(@PathVariable id: String): List<ChatMessage> {
        val chats = chatMessageRepository.findByUserId(id)
        val result = mutableListOf<ChatMessage>()
        val contacts = mutableSetOf<String>()

        chats.forEach { chat ->
            val otherUserId = if (chat.senderId == id) chat.receiverId else chat.senderId
            if (!contacts.contains(otherUserId)) {
                val lastMessage = chatMessageRepository.findLastMessage(chat.senderId, chat.receiverId)
                if (lastMessage != null) {
                    result.add(lastMessage)
                }
                contacts.add(otherUserId)
            }
        }

        return result
    }
}
