package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.ContentGravity
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
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
                content = {
                    /*
                    * Você pode personalizar como quiser dentro aqui (escopo do "content")
                    * */
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalGravity = ContentGravity.CenterHorizontally
                    ) {
                        Text("Toolbar", color = Color.White, fontSize = 22.sp)
                    }
                }
            )
        },
        bodyContent = { /* "bodyContent" é obrigatório */ }
    )
}


