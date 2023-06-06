package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlertSample() {
    var alertIsVisible by remember { mutableStateOf(false) }

    if (alertIsVisible) {
        AlertDialog(
            modifier = Modifier.background(MaterialTheme.colorScheme.onSurface),
            content = {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Bem-vind@ ao Parquinho")
                    Text("tudo bem?")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = { alertIsVisible = false }) {
                            Text("Sim")
                        }
                        TextButton(onClick = { alertIsVisible = false }) {
                            Text("Não")
                        }
                    }
                }
            },
            onDismissRequest = { alertIsVisible = false }
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { alertIsVisible = true }) {
            Text("Mostrar alerta")
        }
    }
}
