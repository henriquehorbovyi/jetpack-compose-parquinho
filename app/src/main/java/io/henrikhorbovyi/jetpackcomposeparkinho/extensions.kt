package io.henrikhorbovyi.jetpackcomposeparkinho

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

fun Context.launchActivity(activity: KClass<out AppCompatActivity>) {
    startActivity(Intent(this, activity.java))
}