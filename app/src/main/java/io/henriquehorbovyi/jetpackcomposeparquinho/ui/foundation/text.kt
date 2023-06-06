package io.henriquehorbovyi.jetpackcomposeparquinho.ui.foundation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextSamples() {
    Column(
        modifier = Modifier.fillMaxHeight().padding(start = 16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Olá mundo!", fontSize = 16.sp)
        Text(text = "Um texto vermelho", fontSize = 18.sp, color = Color.Red)
        Text(
            text = "Um texto em negrito",
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = "Um texto com varios estilos",
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight(800),
                color = Color(0xffdddd77),
                background = Color.Black,
                fontStyle = FontStyle.Italic
            )
        )
    }
}
