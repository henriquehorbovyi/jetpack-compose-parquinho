package io.henrikhorbovyi.jetpackcomposeparkinho.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class ColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ColumnSample()
            }
        }
    }
}

@Composable
fun ColumnSample() {

    /**
     * Experimento alterar os valores do "verticalArrangement"
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

@Composable
@Preview("columnPreview", showDecoration = true)
fun columnPreview() {
    ColumnSample()
}

