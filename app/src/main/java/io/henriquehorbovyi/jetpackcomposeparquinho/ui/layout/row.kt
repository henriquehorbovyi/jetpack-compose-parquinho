package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
