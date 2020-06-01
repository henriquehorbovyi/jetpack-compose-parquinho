package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class ColumnActivity : SampleActivity() {
    @Composable
    override fun Sample() {
        ColumnSample()
    }

    @Composable
    @Preview("columnPreview", showDecoration = true)
    override fun preview() {
        ColumnSample()
    }
}

@Composable
fun ColumnSample() {

    /**
     * Experimente alterar os valores do "verticalArrangement"
    * */
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Primeiro item")
        Text(text = "Segundo item")
        Text(text = "Terceiro item")
    }
}

