package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

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
    var value by remember { mutableStateOf(0f) }

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
    var value by remember { mutableStateOf(0f) }

    /**
     * Nesse exemplo vamos alterar a propriedade [valueRange]
     * para demonstrar um intervalo customizado.
     * */
    Text("${value.toInt()}")
    Slider(
        value = value,
        onValueChange = { value = it },
        valueRange = 0f..100f,
        colors = SliderDefaults.colors(),
    )

}

@Composable
fun SliderWithSteps() {
    var value by remember { mutableStateOf(0f) }
    Text("${value.toInt()}")
    Slider(
        value = value,
        onValueChange = { value = it },
        valueRange = 1f..42f,
        steps = 2
    )

}