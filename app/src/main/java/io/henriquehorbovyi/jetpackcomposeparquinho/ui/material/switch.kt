package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Switch
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
fun SwitchSamples() {
    Center {
        SimpleSwitch()
        Spacer(modifier = Modifier.height(16.dp))
        DisabledSwitch()
    }
}

@Composable
fun SimpleSwitch() {
    
    var isChecked by remember { mutableStateOf(false) }
    Text(text = if (isChecked) "Ligado" else "Desligado")
    Switch(checked = isChecked, onCheckedChange = { isChecked = it })
}


@Composable
fun DisabledSwitch() {
    Text(text = "Essa funcionalidade está desabilitada...")
    Switch(
        checked = false,
        onCheckedChange = { },
        enabled = false
    )
}