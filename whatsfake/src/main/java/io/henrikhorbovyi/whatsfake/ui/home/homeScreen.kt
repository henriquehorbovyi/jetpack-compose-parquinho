package io.henrikhorbovyi.whatsfake.ui.home

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.animation.Crossfade
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Call
import androidx.ui.material.icons.filled.MoreVert
import androidx.ui.material.icons.filled.Search
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp
import io.henrikhorbovyi.whatsfake.R
import io.henrikhorbovyi.whatsfake.ui.AppNavigator
import io.henrikhorbovyi.whatsfake.data.MockedData
import io.henrikhorbovyi.whatsfake.ui.Screen
import io.henrikhorbovyi.whatsfake.ui.navigateTo
import io.henrikhorbovyi.whatsfake.ui.home.conversations.ConversationsView
import io.henrikhorbovyi.whatsfake.ui.home.status.StatusView

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { Toolbar() },
        floatingActionButton = { FloatingActionButton() }
    ) {
        Column {
            Tabs()
            Content()
        }
    }
}

@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text("WhatsFake") },
        elevation = 0.dp,
        actions = {
            IconButton(onClick = {}) { Icon(Icons.Default.Search) }
            IconButton(onClick = {}) { Icon(Icons.Default.MoreVert) }
        }
    )
}

@Composable
private fun Tabs() {
    val (currentIndex, onTabSelected) = state { 1 }
    val tabs = listOf("", "CHATS", "STATUS", "CALLS")

    Surface(elevation = 1.dp) {
        TabRow(
            items = tabs,
            selectedIndex = currentIndex,
            tab = { index, item ->
                if (index == 0) {
                    Tab(
                        icon = { Icon(asset = vectorResource(id = R.drawable.ic_camera)) },
                        selected = false,
                        onSelected = {
                            navigateTo(Screen.Camera)
                            onTabSelected(index)
                        }
                    )
                } else {
                    Tab(
                        text = { Text(item) },
                        activeColor = Color.White,
                        inactiveColor = Color.LightGray,
                        selected = tabs[currentIndex] == item,
                        onSelected = {
                            val screen = when (index) {
                                1 -> Screen.Conversations
                                2 -> Screen.Status
                                else -> Screen.Calls
                            }
                            navigateTo(screen)
                            onTabSelected(index)
                        }
                    )
                }
            }
        )
    }
}

@Composable
private fun Content() {
    Crossfade(current = AppNavigator.currentScreen) { screen ->
        when (screen) {
            is Screen.Conversations -> {
                ConversationsView(
                    conversations = MockedData.conversations,
                    onConversationClicked = {  /*TODO: show chat view*/ }
                )
            }
            is Screen.Status -> StatusView(
                MockedData.status
            ) { /* TODO */ }
            is Screen.Calls -> {
                Text("Calls")
            }
            else -> {
                Text("Camera")
            }
        }
    }
}

@Composable
private fun FloatingActionButton() {
    when (AppNavigator.currentScreen) {
        is Screen.Conversations -> {
            FloatingActionButton(
                onClick = {},
                icon = { Icon(vectorResource(id = R.drawable.ic_message), tint = Color.White) }
            )
        }
        is Screen.Status -> {
            FloatingActionButton(
                onClick = {},
                icon = { Icon(vectorResource(id = R.drawable.ic_camera), tint = Color.White) }
            )
        }
        is Screen.Calls -> {
            FloatingActionButton(
                onClick = {},
                icon = { Icon(asset = Icons.Default.Call, tint = Color.White) }
            )
        }
        is Screen.Camera -> {}
    }
}