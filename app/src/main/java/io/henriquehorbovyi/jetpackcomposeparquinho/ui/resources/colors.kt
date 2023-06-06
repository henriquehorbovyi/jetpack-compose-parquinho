package io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.R

@Composable
fun ColorsSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Oi, eu sou azul",
            modifier = Modifier.padding(16.dp),
            color = colorResource(id = R.color.blue)
        )

        Text(
            text = "Oi, eu sou vermelho",
            modifier = Modifier.padding(16.dp),
            color = colorResource(id = R.color.red)
        )

    }
}