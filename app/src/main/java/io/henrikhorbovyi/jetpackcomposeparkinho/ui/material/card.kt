package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.Card
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class CardActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        CardsSamples()
    }

    @Composable
    @Preview("cardSamples", showDecoration = true)
    override fun preview() {
        CardsSamples()
    }
}

@Composable
fun CardsSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {

        Card {
            Text("Oi, eu sou um card", modifier = Modifier.padding(16.dp))
        }


        Card(
            color = Color.Blue,
            contentColor = Color.Yellow
        ) {
            Text(text = "Card colorido :D", modifier = Modifier.padding(16.dp))
        }

        Card(
            border = Border(2.dp, Color.Black),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Card com bordas",
                modifier = Modifier.padding(16.dp)
            )
        }

        Card(elevation = 8.dp) {
            Text(
                text = "Efeito de onda ao clicar",
                modifier = Modifier
                    .clickable(onClick = {})
                    .padding(16.dp)
            )
        }
    }
}