package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BottomAppBarSample() {
    Scaffold(
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                content = {
                    Icon(Icons.Outlined.Check, tint = Color.White, contentDescription = null)
                },
            )

            // isFloatingActionButtonDocked = true,

        },

        /**
         * Ao atribuirmos o [fabConfiguration] do Scaffold ao nosso BottomAppBar
         * ganhamos a propriedade [floatingActionButtonPosition] que foi inicializada
         * como [FabPosition.CenterDocked]
         *
         * Tente remover o [fabConfiguration] do BottomAppBar e executar o app novamente,
         * você vai notar uma diferença de "margin" ao redor do FloatingActionButton.
         *
         * OBS: Talvez você a previsualização do Android Studio não mostre essa diferença
         * */

        bottomBar = {
            BottomAppBar(
                // cutoutShape = CircleShape
            ) {
                IconButton(
                    content = { Icon(Icons.Outlined.Menu, contentDescription = null) },
                    onClick = {})
                Spacer(Modifier.weight(1f, true))
                IconButton(content = {
                    Icon(
                        Icons.Outlined.Notifications,
                        contentDescription = null
                    )
                }, onClick = {})
            }
        }
    ) { innerPadding -> Surface(modifier = Modifier.padding(innerPadding)) { } /* Esse bloco é obrigatório  */ }
}
