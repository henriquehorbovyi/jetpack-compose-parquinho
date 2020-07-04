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
    // TODO > Replace deprecated [ConstraintSet]
    val helloConstraintSet = ConstraintSet {
        val hello = tag("helloTag")
        val world = tag("worldTag")

        hello.apply {
            top constrainTo parent.top
            bottom constrainTo parent.bottom
            right constrainTo world.left
            left constrainTo parent.left
        }
        world.apply {
            top constrainTo parent.top
            bottom constrainTo parent.bottom
            right constrainTo parent.right
            left constrainTo hello.right
        }
    }

    ConstraintLayout(
        constraintSet = helloConstraintSet,
        modifier = Modifier.size(150.dp).drawBackground(Color.Yellow)
    ) {
        Text(
            "Hello",
            modifier = Modifier.tag("helloTag"),
            fontSize = 22.sp
        )
        Text(
            "World",
            modifier = Modifier.tag("worldTag"),
            fontSize = 22.sp
        )
    }
}