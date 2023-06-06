package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationSample() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(
        NavigationItem("Início", Icons.Outlined.Home),
        NavigationItem("Notificações", Icons.Outlined.Notifications),
        NavigationItem("Perfil", Icons.Outlined.Face)
    )
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Spacer(modifier = Modifier.heightIn(64.dp))
        NavigationBar(
            tonalElevation = 16.dp
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    icon = { Icon(item.icon, contentDescription = null) },
                    label = { Text(text = item.name) },
                    selected = selectedItem == index,
                    onClick = { selectedItem = index  },
                    // activeColor = Color.Black,
                    // inactiveColor = Color.DarkGray
                    /*
                    * Descomente a linha abaixo para esconder as "labels"
                    * quando o item não está selecionado
                    * */
                    // alwaysShowLabels = false
                )
            }
        }
    }
}


data class NavigationItem(
    val name: String,
    val icon: ImageVector
)