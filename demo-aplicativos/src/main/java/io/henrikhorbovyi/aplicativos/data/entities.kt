package io.henrikhorbovyi.aplicativos.data

import androidx.appcompat.app.AppCompatActivity
import io.henrikhorbovyi.whatsfake.WhatsFakeActivity
import kotlin.reflect.KClass

data class App(
    val name: String,
    val clazz: KClass<out AppCompatActivity>? = null
)

object Mocks {

    /* TODO > implement apps and place here each app activity reference */
    val allApps = listOf(
        App("Todo App"),
        App("Instagram"),
        App("WhatsApp", WhatsFakeActivity::class)
    )
}