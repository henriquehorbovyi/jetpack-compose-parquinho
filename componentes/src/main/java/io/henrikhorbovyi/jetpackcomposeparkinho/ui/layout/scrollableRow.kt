package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.Spacer
import androidx.ui.layout.height
import androidx.ui.layout.size
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class ScrollableRowActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        ScrollableRowSamples()
    }

    @Composable
    @Preview("scrollableRowPreview", showDecoration = true)
    override fun preview() {
        ScrollableRowSamples()
    }
}

@Composable
fun ScrollableRowSamples() {
    Center {
        Center(
            Modifier.size(200.dp).drawBackground(Color.Black)
        ) {
            Text("Role as cores", color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            ScrollableRow {
                Box(backgroundColor = Color.Yellow, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.Green, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.Blue, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.Red, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.Cyan, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.White, modifier = Modifier.size(64.dp))
                Box(backgroundColor = Color.Yellow, modifier = Modifier.size(64.dp))
            }
        }
    }
}