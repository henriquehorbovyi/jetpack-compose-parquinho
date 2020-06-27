package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.AdapterList
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.ListItem
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Sample

@Composable
fun TitleStyle(): TextStyle = TextStyle(fontSize = 26.sp, fontWeight = FontWeight(600))

/**
 * Esse "Composable" foi criado para facilitar algumas demonstrações
 * */
@Composable
fun Center(modifier: Modifier = Modifier, children: @Composable() () -> Unit) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) { children() }
}

@Composable
fun SamplesView(samples: List<Sample>, onSampleClicked: (Sample) -> Unit = {}) {
    AdapterList(
        data = samples.sortedBy { it.name },
        itemCallback = { ListItem(text = it.name, onClick = { onSampleClicked(it) }) }
    )
}