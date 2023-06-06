package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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

