package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme


abstract class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Sample()
            }
        }
    }

    @Composable
    abstract fun Sample()

    @Composable
    abstract fun preview()
}