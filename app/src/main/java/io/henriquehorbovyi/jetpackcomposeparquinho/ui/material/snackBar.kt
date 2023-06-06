package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun SnackBarSample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleSnackBar()
        SnackBarWithAction()
    }
}

@Composable
fun SimpleSnackBar() {
    Snackbar(content = { Text(text = "Olá, tudo bem?") })
}

@Composable
fun SnackBarWithAction() {
    Snackbar(content = { Text(text = "Erro ao carregar...") }, action = {
        Text(
            "Tentar novamente",
            style = TextStyle(color = Color.Yellow),
            modifier = Modifier.clickable(onClick = {
                /* sua ação aqu */
            })
        )
    })
}