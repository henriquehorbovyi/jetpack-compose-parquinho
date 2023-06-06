package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun ScrollableColumnSample() {
    Center {
        Center(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Black)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.Yellow)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.Green)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.DarkGray)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.Cyan)
            )
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(Color.Magenta)
            )
        }
    }
}