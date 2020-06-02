package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.BottomNavigation
import androidx.ui.material.BottomNavigationItem
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Face
import androidx.ui.material.icons.outlined.Home
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class BottomNavigationActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        BottomNavigationSample()
    }

    @Composable
    @Preview("bottomNavigation", showDecoration = true)
    override fun preview() {
        BottomNavigationSample()
    }
}

@Composable
fun BottomNavigationSample() {
    val selectedItem = state { 0 }
    val items = listOf(
        NavigationItem("Início", Icons.Outlined.Home),
        NavigationItem("Notificações", Icons.Outlined.Notifications),
        NavigationItem("Perfil", Icons.Outlined.Face)
    )
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Spacer(modifier = Modifier.preferredHeight(64.dp))
        BottomNavigation(
            backgroundColor = Color.White,
            elevation = 16.dp
        ) {
            items.forEachIndexed { index, item ->
                BottomNavigationItem(
                    icon = { Icon(item.icon) },
                    text = { Text(text = item.name) },
                    selected = selectedItem.value == index,
                    onSelected = { selectedItem.value = index },
                    activeColor = Color.Black,
                    inactiveColor = Color.DarkGray
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
    val icon: VectorAsset
)