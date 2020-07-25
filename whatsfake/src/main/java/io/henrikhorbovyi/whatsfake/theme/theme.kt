package io.henrikhorbovyi.whatsfake.theme

import androidx.compose.Composable
import androidx.ui.foundation.isSystemInDarkTheme
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.lightColorPalette

private val LightThemeColors = lightColorPalette(
    primary = primary,
    primaryVariant = primaryLight,
    onPrimary = Color.White,
    secondary = secondary,
    secondaryVariant = secondaryLight,
    onSecondary = Color.White,
    error = error
)

@Composable
fun WhatsFakeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme (
        colors = LightThemeColors,
        content = content
    )
}
