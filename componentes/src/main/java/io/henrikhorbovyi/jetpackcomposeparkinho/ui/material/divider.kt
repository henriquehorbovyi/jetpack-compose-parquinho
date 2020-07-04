package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class DividerActivity : ComponentActivity() {
    @Composable
    override fun ComponentExample() {
        DividerSamples()
    }


    @Composable
    @Preview("dividerPreview", showDecoration = true)
    override fun preview() {
        DividerSamples()
    }
}

@Composable
fun DividerSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {

        /**
         * Simples Divider
         * */
        Divider(
            color = Color.Red,
            thickness = 4.dp
        )
        /**
         * Divider começando com uma diferença de 16dp
         * */
        Divider(
            color = Color.Black,
            thickness = 2.dp,
            startIndent = 16.dp
        )

    }
}