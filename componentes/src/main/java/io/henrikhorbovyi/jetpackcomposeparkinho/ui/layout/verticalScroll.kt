package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.size
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class VerticalScrollerActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        VerticalScrollerSample()
    }

    @Composable
    @Preview("verticalScrollerPreview", showDecoration = true)
    override fun preview() {
        VerticalScrollerSample()
    }
}

@Composable
fun VerticalScrollerSample() {
    Center {
        Center(modifier = Modifier.size(200.dp).drawBackground(Color.Black)) {
            VerticalScroller {
                Box(backgroundColor = Color.Red, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.Yellow, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.Green, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.DarkGray, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.White, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.Cyan, modifier = Modifier.size(42.dp))
                Box(backgroundColor = Color.Magenta, modifier = Modifier.size(42.dp))
            }
        }
    }
}