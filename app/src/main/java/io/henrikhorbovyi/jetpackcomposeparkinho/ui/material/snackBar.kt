package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Snackbar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SnackBarDemo()
            }
        }
    }
}

@Composable
fun SnackBarDemo() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        SnackBarSample()
        SnackBarWithAction()
    }
}

@Composable
fun SnackBarSample() {
    Snackbar({ Text(text = "Olá, tudo bem?") })
}

@Composable
fun SnackBarWithAction() {
    Snackbar({ Text(text = "Erro ao carregar...") }, action = {
        Text(
            "Tentar novamente",
            style = TextStyle(color = Color.Yellow),
            modifier = Modifier.clickable(onClick = {
                /* sua ação aqu */
            })
        )
    })
}

@Composable
@Preview("snackBarsPreview", showDecoration = true)
fun SnackBarPreview() {
    SnackBarDemo()
}