package io.henrikhorbovyi.whatsfake.ui

import androidx.compose.getValue
import androidx.compose.mutableStateOf
import androidx.compose.setValue

sealed class Screen {
    object Camera : Screen()
    object Conversations : Screen()
    object Status : Screen()
    object Calls : Screen()
}

object AppNavigator {
    var currentScreen by mutableStateOf<Screen>(Screen.Conversations)
}

/**
 * Temporary solution pending navigation support.
 */
fun navigateTo(destination: Screen) {
    AppNavigator.currentScreen = destination
}

