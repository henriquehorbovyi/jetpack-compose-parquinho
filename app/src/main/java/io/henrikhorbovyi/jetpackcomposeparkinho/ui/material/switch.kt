package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.*
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Spacer
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.height
import androidx.ui.material.Switch
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class SwitchActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SwitchSamples()
    }


    @Composable
    override fun preview() {
        SwitchSamples()
    }
}

@Composable
fun SwitchSamples() {
    Center(modifier = Modifier.fillMaxSize()) {
        SimpleSwitch()
        Spacer(modifier = Modifier.height(16.dp))
        UnabledSwitch()
    }
}

@Composable
fun SimpleSwitch() {
    
    var isChecked by state { false }
    Text(text = if (isChecked) "Ligado" else "Desligado")
    Switch(checked = isChecked, onCheckedChange = { isChecked = it })
}


@Composable
fun UnabledSwitch() {
    Text(text = "Essa funcionalidade está desabilitada...")
    Switch(
        checked = false,
        onCheckedChange = { },
        enabled = false
    )
}