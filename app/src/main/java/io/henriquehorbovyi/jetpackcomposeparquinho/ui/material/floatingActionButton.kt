package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun FloatingActionButtonSamples(onFabClicked: () -> Unit = {}) {
    Scaffold(floatingActionButton = {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ExtendedFloatingActionButton(
                text = { Text("Chamar", color = Color.White) },
                icon = { Icon(Icons.Outlined.Call, tint = Color.White, contentDescription = null) },
                onClick = { onFabClicked() }
            )
            FloatingActionButton(
                onClick = { onFabClicked() },
                content = { FabIcon() }
            )
        }
    }) {
        /* Scaffold Modifier Scope */
        Surface(modifier = Modifier.padding(it)) {}
    }
}

@Composable
fun FabIcon() {
    Text("+", style = TextStyle(color = Color.White, fontSize = 28.sp))
}
