package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ProgressSamples() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
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

