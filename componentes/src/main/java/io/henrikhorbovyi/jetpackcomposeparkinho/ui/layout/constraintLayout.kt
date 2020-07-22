package io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.tag
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.ConstraintLayout
import androidx.ui.layout.ConstraintSet
import androidx.ui.layout.size
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class ConstraintLayoutActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        ConstraintLayoutSample()
    }

    @Composable
    @Preview("constraintLayoutPreview", showDecoration = true)
    override fun preview() {
        ConstraintLayoutSample()
    }
}

@Composable
fun ConstraintLayoutSample() {
    Center {
        Box(backgroundColor = Color.Black, modifier = Modifier.size(300.dp)) {
            Center {
                HelloWorldConstrained()
            }
        }
    }
}


@Composable
fun HelloWorldConstrained() {
    ConstraintLayout {
        val (hello, world) = createRefs()

        Text(
            "Olá",
            fontSize = 22.sp,
            color = Color.Red,
            modifier = Modifier.constrainAs(hello) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }
        )
        Text(
            "Mundo",
            fontSize = 22.sp,
            color = Color.Blue,
            modifier = Modifier.constrainAs(world) {
                start.linkTo(hello.end, margin = 16.dp)
                end.linkTo(parent.end)
            }
        )
    }
}