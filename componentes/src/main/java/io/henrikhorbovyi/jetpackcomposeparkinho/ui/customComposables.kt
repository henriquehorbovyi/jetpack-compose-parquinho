package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.ListItem
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Component

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
fun ComponentsView(components: List<Component>, onComponentClicked: (Component) -> Unit = {}) {
    LazyColumnItems(
        items = components.sortedBy { it.name },
        itemContent = { ListItem(text = it.name, onClick = { onComponentClicked(it) }) }
    )
}