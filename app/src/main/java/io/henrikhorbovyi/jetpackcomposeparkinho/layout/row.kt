package io.henrikhorbovyi.jetpackcomposeparkinho.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class RowActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                RowSample()
            }
        }
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


@Composable
@Preview("rowPreview", showDecoration = true)
fun rowPreview() {
    RowSample()
}