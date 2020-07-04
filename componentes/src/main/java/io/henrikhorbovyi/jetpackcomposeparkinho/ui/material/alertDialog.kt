package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.AlertDialog
import androidx.ui.material.Button
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class AlertDialogActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        AlertSample()
    }

    @Composable
    @Preview("alertDialogPreview", showDecoration = true)
    override fun preview() {
        AlertSample()
    }
}


@Composable
fun AlertSample() {
    val alertIsVisible = state { false }
    if (alertIsVisible.value) {
        AlertDialog(
            title = { Text("Bem-vind@ ao Parkinho") },
            text = { Text("tudo bem?") },
            buttons = {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = { alertIsVisible.value = false }) {
                        Text("Sim")
                    }
                    TextButton(onClick = { alertIsVisible.value = false }) {
                        Text("Não")
                    }
                }
            },
            onCloseRequest = {
                alertIsVisible.value = false
            }
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        Button(onClick = { alertIsVisible.value = true }) {
            Text("Mostrar alerta")
        }
    }
}