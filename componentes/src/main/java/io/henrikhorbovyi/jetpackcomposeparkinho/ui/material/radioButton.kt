package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class RadioButtonActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        RadioButtonSample()
    }

    @Composable
    override fun preview() {
        RadioButtonSample()
    }
}

@Composable
fun RadioButtonSample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        SimpleRadioGroup()

        SimpleCustomRadioButton()

        RadioGroupTextItemSample()
    }
}


@Composable
fun SimpleRadioGroup() {
    val options = listOf("Android", "IOS")
    val (option, onSelected) = state { options[0] }
    RadioGroup(
        options = options,
        selectedOption = option,
        onSelectedChange = onSelected
    )
}

@Composable
fun SimpleCustomRadioButton() {
    val options = listOf("Usar Compose ️\uD83D\uDE0D️", "Usar XML \uD83D\uDE49️")
    val selectedOption = state { options[0] }

    Row(Modifier.fillMaxWidth().padding(8.dp)) {
        RadioButton(
            selected = selectedOption.value == options[0],
            onSelect = { selectedOption.value = options[0] }
        )
        Text(
            text = options[0],
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        )

        RadioButton(
            selected = selectedOption.value == options[1],
            onSelect = { selectedOption.value = options[1] }
        )
        Text(
            text = options[1],
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


/**
 * Ja existe um composable que faz a juncao de um [RadioButton] + [Text]
 * */
@Composable
fun RadioGroupTextItemSample() {
    val selectedOption = state { "Sim" }
    val options = listOf("Sim", "Nao")

    RadioGroup {
        Column {
            RadioGroupTextItem(
                selected = selectedOption.value == options[0],
                onSelect = { selectedOption.value = options[0] },
                text = "Primeira opcao"
            )
            RadioGroupTextItem(
                selected = selectedOption.value == options[1],
                onSelect = { selectedOption.value = options[1] },
                text = "Segunda opcao"
            )
        }
    }
}