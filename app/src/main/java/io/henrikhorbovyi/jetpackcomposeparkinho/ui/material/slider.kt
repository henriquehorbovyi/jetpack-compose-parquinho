package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.Slider
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class SliderActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SliderSamples()
    }

    @Composable
    @Preview("sliderPreview")
    override fun preview() {
        SliderSamples()
    }
}

@Composable
fun SliderSamples() {
    Center(modifier = Modifier.padding(16.dp)) {
        SimpleSlider()
        SliderWithCustomRange()
        SliderWithSteps()
    }
}

@Composable
fun SimpleSlider() {
    var value by state { 0f }

    /**
     * Usando um Text para mostrar o valor sendo alterado
     * */
    Text("$value")

    /**
     * Perceba que o intervalo padrão é entre 0 e 1
     * */
    Slider(
        value = value,
        onValueChange = { value = it }
    )
}

@Composable
fun SliderWithCustomRange() {
    var value by state { 0f }

    /**
     * Nesse exemplo vamos alterar a propriedade [valueRange]
     * para demonstrar um intervalo customizado.
     * */
    Text("${value.toInt()}")
    Slider(
        value = value,
        onValueChange = { value = it },
        valueRange = 0f..100f,
        color = Color.Red
    )

}

@Composable
fun SliderWithSteps() {
    var value by state { 0f }
    Text("${value.toInt()}")
    Slider(
        value = value,
        onValueChange = { value = it },
        valueRange = 1f..42f,
        color = Color.Black,
        steps = 2
    )

}