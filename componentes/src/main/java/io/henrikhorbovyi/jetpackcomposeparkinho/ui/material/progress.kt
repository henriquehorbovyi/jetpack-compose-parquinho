package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.ContentGravity
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.CircularProgressIndicator
import androidx.ui.material.LinearProgressIndicator
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class ProgressActivity : ComponentActivity() {
    @Composable
    override fun ComponentExample() {
        ProgressSamples()
    }

    @Composable
    @Preview("progressSamples", showDecoration = true)
    override fun preview() {
        ProgressSamples()
    }
}

@Composable
fun ProgressSamples() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = ContentGravity.CenterHorizontally
    ) {

        /**
         * Se você não informar o valor da propriedade [progress]
         * ele continuara em "loop".
         * */
        CircularProgressIndicator()
        LinearProgressIndicator()

        /**
         * Mas ao passar o valor da propriedade [progress]
         * você tera que fazer a lógica de incremento.
         * */
        CircularProgressIndicator(0.5f, color = Color.Green)
        LinearProgressIndicator(0.5f, color = Color.Red)
    }

}

