package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.sp

@Composable
fun TitleStyle(): TextStyle = TextStyle(fontSize = 26.sp, fontWeight = FontWeight(600))


@Composable
fun Center(modifier: Modifier = Modifier, children: @Composable() () -> Unit) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) { children() }
}