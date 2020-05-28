package io.henrikhorbovyi.jetpackcomposeparkinho

import androidx.compose.Composable
import androidx.compose.emptyContent
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.layout.Spacer
import androidx.ui.layout.height
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.Dp
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun SymmetricSpacer(
    vertical: Dp = 0.dp,
    horizontal: Dp = 0.dp,
    children: @Composable() () -> Unit = emptyContent()
) {
    Spacer(modifier = Modifier.height(vertical))
    Box(paddingStart = horizontal, paddingEnd = horizontal) { children() }
    Spacer(modifier = Modifier.height(vertical))
}

@Composable
fun TitleStyle(): TextStyle = TextStyle(fontSize = 26.sp, fontWeight = FontWeight(600))
