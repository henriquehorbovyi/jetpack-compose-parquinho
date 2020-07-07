package io.henrikhorbovyi.whatsfake.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview

class WhatsFakeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { WhatsFakeApp() }
    }

    @Composable
    @Preview(showDecoration = true)
    fun preview() {
        WhatsFakeApp()
    }
}