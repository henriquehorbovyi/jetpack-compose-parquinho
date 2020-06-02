package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.ContentGravity
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.AlertDialog
import androidx.ui.material.Button
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class AlertDialogActivity : SampleActivity() {

    @Composable
    override fun Sample() {
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
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = ContentGravity.CenterHorizontally
    ) {
        Button(onClick = { alertIsVisible.value = true }) {
            Text("Mostrar alerta")
        }
    }
}