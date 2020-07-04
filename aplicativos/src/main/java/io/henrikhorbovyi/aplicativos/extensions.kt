package io.henrikhorbovyi.aplicativos

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

fun Context.launchActivity(activity: KClass<out AppCompatActivity>) {
    startActivity(Intent(this, activity.java))
}

fun Context.toast(text: String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
