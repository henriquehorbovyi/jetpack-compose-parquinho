package io.henrikhorbovyi.whatsfake.data.repository

import io.henrikhorbovyi.whatsfake.data.Message
import io.henrikhorbovyi.whatsfake.data.MockedData

interface ConversationsRepository {
    fun allConversations(): List<Message>
}

class RealConversationsRepository : ConversationsRepository {

    override fun allConversations(): List<Message> {
        return MockedData.conversations
    }
}