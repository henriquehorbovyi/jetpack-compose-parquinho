package io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.padding
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class TextActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        TextSamples()
    }

    @Composable
    @Preview("textPreview", showDecoration = true)
    override fun preview() {
        TextSamples()
    }
}

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
