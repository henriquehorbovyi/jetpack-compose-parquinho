package io.henrikhorbovyi.whatsfake.ui

import androidx.compose.Composable
import io.henrikhorbovyi.whatsfake.theme.WhatsFakeTheme
import io.henrikhorbovyi.whatsfake.ui.home.HomeScreen

@Composable
fun WhatsFakeApp() {
    WhatsFakeTheme { AppContent() }
}

@Composable
fun AppContent() {
    HomeScreen()
}

