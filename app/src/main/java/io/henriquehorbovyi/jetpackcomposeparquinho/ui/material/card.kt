package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardsSamples() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card {
            Text("Oi, eu sou um card", modifier = Modifier.padding(16.dp))
        }


        Card(
            colors = CardDefaults.cardColors(containerColor = Color.Gray)
        ) {
            Text(text = "Card colorido :D", modifier = Modifier.padding(16.dp))
        }

        Card(
            border = BorderStroke(2.dp, Color.Black),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Card com bordas",
                modifier = Modifier.padding(16.dp)
            )
        }

        Card(elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
            Text(
                text = "Efeito de onda ao clicar",
                modifier = Modifier
                    .clickable(onClick = {})
                    .padding(16.dp)
            )
        }
    }
}