package io.henrikhorbovyi.whatsfake.ui.home.conversations

import androidx.compose.Composable
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.whatsfake.data.Message
import io.henrikhorbovyi.whatsfake.data.MockedData

@Composable
@Preview("chatsPreview")
fun preview() {
    ConversationsView(conversations = MockedData.conversations)
}

@Composable
fun ConversationsView(
    conversations: List<Message>,
    onConversationClicked: (Message) -> Unit = {}
) {
    LazyColumnItems(items = conversations) {
        ConversationItem(it, onClick = onConversationClicked)
    }
}