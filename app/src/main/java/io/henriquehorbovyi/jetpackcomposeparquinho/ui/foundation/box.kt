package io.henriquehorbovyi.jetpackcomposeparquinho.ui.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BoxSample() {
    Column {
        Box(
            modifier = Modifier
                .height(220.dp)
                .fillMaxWidth()
                .padding(24.dp)
                .background(Color.Gray)
                .clip(RoundedCornerShape(8.dp))
                .border(4.dp, Color.Black),
        ) {
            Text("Eu sou uma caixa :D", color = Color.White)
        }

        Box(
            modifier = Modifier
                .size(220.dp)
                .padding(32.dp)
                .background(Color.Red)
                .clip(RoundedCornerShape(8.dp)),
        ) {
            Text("Eu tbm! :)", color = Color.White)
        }
    }
}
