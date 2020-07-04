package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class RowActivity : ComponentActivity() {
    @Composable
    override fun ComponentExample() {
        RowSample()
    }

    @Composable
    @Preview("rowPreview", showDecoration = true)
    override fun preview() {
        RowSample()
    }
}

@Composable
fun RowSample() {

    /**
     * Experimente alterar os valores do "horizontalArrangement"
     * */
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        repeat(3) { index ->
            Text("Item $index")
        }
    }
}
