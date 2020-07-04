package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.material.ExtendedFloatingActionButton
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.Scaffold
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Call
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.toast

class FloatingActionButtonActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        Column {
            FloatingActionButtonSamples(onFabClicked = {
                toast("Botão clicado")
            })

        }
    }

    @Composable
    @Preview(name = "simpleFabSample", showDecoration = true)
    override fun preview() {
        Row {
            FloatingActionButtonSamples()
        }
    }
}

@Composable
fun FloatingActionButtonSamples(onFabClicked: () -> Unit = {}) {
    Scaffold(floatingActionButton = {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ExtendedFloatingActionButton(
                text = { Text("Chamar", color = Color.White) },
                icon = { Icon(Icons.Outlined.Call, tint = Color.White) },
                onClick = { onFabClicked() }
            )
            FloatingActionButton(
                onClick = { onFabClicked() },
                icon = { FabIcon() }
            )
        }
    }) {
        /* Scaffold Modifier Scope */
    }
}

@Composable
fun FabIcon() {
    Text("+", style = TextStyle(color = Color.White, fontSize = 28.sp))
}
