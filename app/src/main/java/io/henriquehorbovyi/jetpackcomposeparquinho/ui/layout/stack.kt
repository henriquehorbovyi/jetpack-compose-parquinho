package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun StackSamples() {
    Center {
        SimpleStack()
        Spacer(modifier = Modifier.height(32.dp))
        ChildrenWithGravity()
    }
}

@Composable
fun SimpleStack() {
    /**
     * [Box] é o equivalente ao [FrameLayout]
     * * */
    Box(modifier = Modifier.size(300.dp)) {
        Box(modifier = Modifier
            .size(300.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(250.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(200.dp)
            .background(Color.Green))
    }
}

@Composable
fun ChildrenWithGravity() {
    /**
     * Podemos alterar a gravidade dos filhos da Stack
     * */
    Box(modifier = Modifier
        .size(300.dp)
        .background(Color.LightGray)) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(Color.Red)
                .align(Alignment.TopCenter)
        )
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(Color.Blue)
                .align(Alignment.CenterStart)
        )
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(Color.Green)
                .align(Alignment.CenterEnd)
        )
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(Color.Yellow)
                .align(Alignment.BottomCenter)
        )
    }
}