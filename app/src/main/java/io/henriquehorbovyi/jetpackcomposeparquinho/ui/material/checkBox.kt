package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.state.ToggleableState.*


@Composable
fun CheckBoxSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CheckboxWithLabel()
        TriStateCheckBoxSample()
    }
}


@Composable
fun CheckboxWithLabel() {
    var isChecked by remember { mutableStateOf(false) }

    Row {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { checked -> isChecked = checked }
        )
        Text(
            text = "Li e concordo com os termos de uso",
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun TriStateCheckBoxSample() {
    var triState by remember { mutableStateOf(Indeterminate) }
    var textState by remember { mutableStateOf("Não sei") }

    Row {
        TriStateCheckbox(
            state = triState,
            onClick = {
                triState = when (triState) {
                    androidx.compose.ui.state.ToggleableState.Off -> Indeterminate
                    androidx.compose.ui.state.ToggleableState.On -> androidx.compose.ui.state.ToggleableState.Off
                    else -> androidx.compose.ui.state.ToggleableState.On
                }
                textState = when(triState) {
                    androidx.compose.ui.state.ToggleableState.Off -> "Não"
                    androidx.compose.ui.state.ToggleableState.On -> "Sim"
                    else -> "Não sei"
                }
            }
        )
        Text(textState,  modifier = Modifier.padding(start = 8.dp))
    }
}