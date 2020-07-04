package io.henrikhorbovyi.aplicativos

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun Title(
    text: String,
    modifier: Modifier = Modifier
) {
    val defaultModifier = Modifier.padding(all = 16.dp)
    Text(
        text,
        fontSize = 26.sp,
        modifier = modifier + defaultModifier
    )
}

@Composable
fun Center(modifier: Modifier = Modifier, children: @Composable() () -> Unit) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) { children() }
}
