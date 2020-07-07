package io.henrikhorbovyi.whatsfake.data

data class Message(
    val text: String,
    val sender: User,
    val sentTime: String = "",
    val unseen: Boolean = false
)

data class Status(
    val user: User,
    val picture: String,
    val date: String
)

data class Call(
    val user: User,
    val date: String
)

class User(
    val name: String,
    val pictureUrl: String
)