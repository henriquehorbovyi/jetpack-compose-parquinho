package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

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
        floatingActionButton = { Fab() }
    ) {
        MyAppBody(modifier = Modifier.padding(it))
    }
}

@Composable
fun Fab() {
    FloatingActionButton(onClick = {}, Modifier.background(Color.Black)) {
        Icon(Icons.Default.Add, tint = Color.White, contentDescription = null)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AwesomeTopAppBar() {
    TopAppBar(
        title = { Text("Meu App") },
        navigationIcon = {
            IconButton(
                content = { Icon(Icons.Default.Menu, tint = Color.White, contentDescription = null) },
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
fun MyAppBody(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Conteúdo do seu app")
    }
}