package io.henrikhorbovyi.jetpackcomposeparkinho

import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

data class User(
    val name: String,
    val phone: String
) {

    companion object {
        fun mockedList() = listOf(
            User("Joe", "9768"),
            User("Marisa", "2355"),
            User("Anthony", "6756"),
            User("Ian", "4365")
        )
    }
}

data class Sample(
    val name: String,
    val clazz: KClass<out AppCompatActivity>
)