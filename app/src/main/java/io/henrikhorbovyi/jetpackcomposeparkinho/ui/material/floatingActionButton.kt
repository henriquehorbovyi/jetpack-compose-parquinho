package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.Scaffold
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.toast

class FloatingActionButtonActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        FloatingActionButtonSample(onFabClicked = {
            toast("Botão clicado")
        })
    }

    @Composable
    @Preview(name = "simpleFabSample", showDecoration = true)
    override fun preview() {
        FloatingActionButtonSample()
    }
}

@Composable
fun FloatingActionButtonSample(onFabClicked: () -> Unit = {}) {
    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = { onFabClicked() },
            icon = { FabIcon() }
        )
    }) {
        /* Scaffold Modifier Scope */
    }
}

@Composable
fun FabIcon() {
    Text("+", style = TextStyle(color = Color.White, fontSize = 28.sp))
}
