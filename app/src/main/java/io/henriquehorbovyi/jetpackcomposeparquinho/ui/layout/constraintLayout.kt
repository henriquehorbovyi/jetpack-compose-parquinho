package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun ConstraintLayoutSample() {
    Center {
        Box(modifier = Modifier.size(300.dp).background(Color.Black)) {
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