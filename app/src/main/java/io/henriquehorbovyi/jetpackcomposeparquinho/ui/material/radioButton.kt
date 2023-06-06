package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleRadioGroup() {
    val options = listOf("Android", "IOS")
    var option by remember { mutableStateOf(options[0]) }
    Column {
        options.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (text == option),
                        onClick = {
                            option = text
                        }
                    )
                    .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    selected = (text == option),
                    onClick = { option = text }
                )
                Text(
                    text = text,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}

@Composable
fun SimpleCustomRadioButton() {
    val options = listOf("Usar Compose ️\uD83D\uDE0D️", "Usar XML \uD83D\uDE49️")
    var selectedOption by remember { mutableStateOf(options[0]) }

    Row(Modifier.fillMaxWidth().padding(8.dp)) {
        RadioButton(
            selected = selectedOption == options[0],
            onClick = { selectedOption = options[0] }
        )
        Text(
            text = options[0],
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        )

        RadioButton(
            selected = selectedOption == options[1],
            onClick = { selectedOption = options[1] }
        )
        Text(
            text = options[1],
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}
