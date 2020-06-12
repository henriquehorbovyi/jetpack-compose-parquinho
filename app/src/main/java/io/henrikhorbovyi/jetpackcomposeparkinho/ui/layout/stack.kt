package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class StackActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        StackSamples()
    }

    @Composable
    @Preview("stackPreview", showDecoration = true)
    override fun preview() {
        StackSamples()
    }
}

@Composable
fun StackSamples() {
    Center{
        SimpleStack()
        Spacer(modifier = Modifier.height(32.dp))
        ChildrenWithGravity()
    }
}

@Composable
fun SimpleStack() {
    /**
     * [Stack] é o equivalente ao [FrameLayout],
     * logo todos os filhos da Stack ficarão posicionados como
     * o nome já sugere: empilhados :)
     * */
    Stack(modifier = Modifier.size(300.dp)) {
        Box(backgroundColor = Color.Red, modifier = Modifier.size(300.dp))
        Box(backgroundColor = Color.Blue, modifier = Modifier.size(250.dp))
        Box(backgroundColor = Color.Green, modifier = Modifier.size(200.dp))
    }
}

@Composable
fun ChildrenWithGravity() {
    /**
     * Podemos alterar a gravidade dos filhos da Stack
     * */
    Stack(modifier = Modifier.size(300.dp).drawBackground(Color.LightGray)) {
        Box(
            backgroundColor = Color.Red,
            modifier = Modifier.size(32.dp).gravity(Alignment.TopCenter)
        )
        Box(
            backgroundColor = Color.Blue,
            modifier = Modifier.size(32.dp).gravity(Alignment.CenterStart)
        )
        Box(
            backgroundColor = Color.Green,
            modifier = Modifier.size(32.dp).gravity(Alignment.CenterEnd)
        )
        Box(
            backgroundColor = Color.Yellow,
            modifier = Modifier.size(32.dp).gravity(Alignment.BottomCenter)
        )
    }
}