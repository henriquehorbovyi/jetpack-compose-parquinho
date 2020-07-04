package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme


abstract class ComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ComponentExample()
            }
        }
    }

    @Composable
    abstract fun ComponentExample()

    @Composable
    abstract fun preview()
}