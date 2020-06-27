package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.fillMaxWidth
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Add
import androidx.ui.material.icons.filled.Menu
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class ScaffoldActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        ScaffoldSample()
    }

    @Composable
    @Preview("scaffoldPreview", showDecoration = true)
    override fun preview() {
        ScaffoldSample()
    }
}

/**
 * O [Scaffold] existe para juntar em um só lugar alguns dos principais
 * componentes do Material Design.
 *
 * Ele serve como um composable pai que conecta outros componentes básicos
 * para a criação de apps baseados no Material.
 *
 * */

@Composable
fun ScaffoldSample() {
    Scaffold(
        topBar = { AwesomeTopAppBar() },
        bottomBar = { AwesomeBottomBar() },
        drawerContent = { AwesomeDrawerContent() },
        floatingActionButton = { Fab() }
    ) {
        MyAppBody()
    }
}

@Composable
fun Fab() {
    FloatingActionButton(onClick = {}, backgroundColor = Color.Black) {
        Icon(Icons.Default.Add, tint = Color.White)
    }
}

@Composable
fun AwesomeTopAppBar() {
    TopAppBar(
        title = { Text("Meu App") },
        navigationIcon = {
            IconButton(
                icon = { Icon(Icons.Default.Menu, tint = Color.White) },
                onClick = {}
            )
        }
    )
}

@Composable
fun AwesomeBottomBar() {
    BottomAppBar {
        Text(
            "Customize como desejar",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun AwesomeDrawerContent() {
    Text("Seu drawer aqui")
}

@Composable
fun MyAppBody() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        Text("Conteúdo do seu app")
    }
}