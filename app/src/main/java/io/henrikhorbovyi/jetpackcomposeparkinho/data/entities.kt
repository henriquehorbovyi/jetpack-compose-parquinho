package io.henrikhorbovyi.jetpackcomposeparkinho.data

import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

data class Sample(
    val name: String,
    val clazz: KClass<out AppCompatActivity>
)