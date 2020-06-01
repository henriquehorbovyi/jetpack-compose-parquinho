package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.Snackbar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class SnackBarActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SnackBarSample()
    }

    @Composable
    @Preview("snackBarsPreview", showDecoration = true)
    override fun preview() {
        SnackBarSample()
    }
}

@Composable
fun SnackBarSample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        SimpleSnackBar()
        SnackBarWithAction()
    }
}

@Composable
fun SimpleSnackBar() {
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