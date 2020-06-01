package io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.Box
import androidx.ui.foundation.ContentGravity
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class BoxActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        BoxSample()
    }

    @Composable
    @Preview("boxPreview", showDecoration = true)
    override fun preview() {
        BoxSample()
    }
}

@Composable
fun BoxSample() {
    Column {
        Box(
            modifier = Modifier.height(220.dp).fillMaxWidth().padding(24.dp),
            backgroundColor = Color.Gray,
            shape = RoundedCornerShape(8.dp),
            gravity = ContentGravity.Center,
            border = Border(4.dp, Color.Black)
        ) {
            Text("Eu sou uma caixa :D", color = Color.White)
        }

        Box(
            modifier = Modifier.width(220.dp).height(220.dp).padding(32.dp),
            backgroundColor = Color.Red,
            shape = RoundedCornerShape(8.dp),
            gravity = ContentGravity.Center
        ) {
            Text("Eu tbm! :)", color = Color.White)
        }
    }
}
