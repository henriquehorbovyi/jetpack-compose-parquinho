package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.MutableState
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.foundation.selection.ToggleableState
import androidx.ui.layout.*
import androidx.ui.material.Checkbox
import androidx.ui.material.TriStateCheckbox
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class CheckBoxActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        CheckBoxSamples()
    }

    @Composable
    @Preview("checkBoxSample", showDecoration = true)
    override fun preview() {
        CheckBoxSamples()
    }
}

@Composable
fun CheckBoxSamples() {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        CheckboxWithLabel()
        TriStateCheckBoxSample()
    }
}


@Composable
fun CheckboxWithLabel() {
    val (isChecked, checkedState) = state { false }

    Row {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { checked -> checkedState(checked) }
        )
        Text(
            text = "Li e concordo com os termos de uso",
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun TriStateCheckBoxSample() {
    val triState = state { ToggleableState.Indeterminate }
    val textState = state { "Não sei" }
    Row {
        TriStateCheckbox(
            state = triState.value,
            onClick = {
                triState.value = when (triState.value) {
                    ToggleableState.Off -> ToggleableState.Indeterminate
                    ToggleableState.On -> ToggleableState.Off
                    else -> ToggleableState.On
                }
                textState.value = when(triState.value) {
                    ToggleableState.Off -> "Não"
                    ToggleableState.On -> "Sim"
                    else -> "Não sei"
                }
            }
        )
        Text(textState.value,  modifier = Modifier.padding(start = 8.dp))
    }
}