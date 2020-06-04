package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.Search
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class ToolbarActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SimpleToolbarSample()
    }

    @Composable
    @Preview("toolbarPreview", showDecoration = true)
    override fun preview() {
        SimpleToolbarSample()
    }
}

@Composable
fun SimpleToolbarSample() {
    Scaffold(
        topAppBar = {
            TopAppBar(
                backgroundColor = Color.Red,
                elevation = 8.dp,
                title = { Text("Atividades", color = Color.White) },
                navigationIcon = { IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.Menu, tint = Color.White) }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(asset = Icons.Default.Search, tint = Color.White)
                    }
                }
            )
        },
        bodyContent = { /* "bodyContent" é obrigatório */ }
    )
}


