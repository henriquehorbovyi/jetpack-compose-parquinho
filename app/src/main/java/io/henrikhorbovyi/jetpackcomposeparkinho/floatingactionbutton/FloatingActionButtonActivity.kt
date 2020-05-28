package io.henrikhorbovyi.jetpackcomposeparkinho.floatingactionbutton

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp

class FloatingActionButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                FloatingActionButtonSample()
            }
        }
    }
}

@Composable
fun FloatingActionButtonSample() {
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = { Log.i("FAB_PRESSED", "\\o/") }) { FabIcon() }
    }) { /*  Modifier Scope*/ }
}

@Composable
fun FabIcon() {
    Text("+", style = TextStyle(color = Color.White, fontSize = 28.sp))
}

@Composable
@Preview(name = "SimpleFabSample", showDecoration = true)
fun preview() {
    FloatingActionButtonSample()
}