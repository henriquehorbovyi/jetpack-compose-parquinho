package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorPainter
import androidx.ui.layout.*
import androidx.ui.material.BottomAppBar
import androidx.ui.material.Button
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.Scaffold
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Add
import androidx.ui.material.icons.outlined.Menu
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.IntPxSize
import androidx.ui.unit.dp
import androidx.ui.unit.ipx
import androidx.ui.unit.px
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class BottomAppBarActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        BottomAppBarSample()
    }

    @Composable
    @Preview("bottomAppBarPreview", showDecoration = true)
    override fun preview() {
        BottomAppBarSample()
    }
}

@Composable
fun BottomAppBarSample() {
    Scaffold(
        bottomAppBar = {
            BottomAppBar(
                contentColor = Color.White,
                backgroundColor = Color.Black
            ) {}
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                icon = { Icon(painter = VectorPainter(asset = Icons.Outlined.Add), tint = Color.White) }
            )
        },
        floatingActionButtonPosition = Scaffold.FabPosition.CenterDocked,
        bodyContent = {}
    )
}
