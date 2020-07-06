package io.henrikhorbovyi.whatsfake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class WhatsFakeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Text("WhatsFake - ainda não implementado")
            }
        }
    }

    @Composable
    @Preview("whatsFakePreview", showDecoration = true)
    private fun preview() {
        Text("Ainda não implementado")
    }
}