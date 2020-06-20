package io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.res.colorResource
import androidx.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.R
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class ColorsActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        ColorsSamples()
    }

    @Composable
    @Preview("colorsPreview", showDecoration = true)
    override fun preview() {
        ColorsSamples()
    }
}

@Composable
fun ColorsSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Oi, eu sou azul",
            modifier = Modifier.padding(16.dp),
            color = colorResource(id = R.color.teel_200)
        )

        Text(
            text = "Oi, eu sou vermelho",
            modifier = Modifier.padding(16.dp),
            color = colorResource(id = R.color.red)
        )

    }
}