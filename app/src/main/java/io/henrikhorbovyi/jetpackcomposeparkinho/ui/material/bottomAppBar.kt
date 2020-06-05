package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Spacer
import androidx.ui.material.BottomAppBar
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Check
import androidx.ui.material.icons.outlined.Menu
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class BottomAppBarActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        BottomAppBarSample()
    }

    @Composable
    @Preview("bottomAppBarPreview", showDecoration = true)
    override fun preview() {
        BottomAppBarSample()
    }
}

@Composable
fun BottomAppBarSample() {
    Scaffold(
        floatingActionButtonPosition = Scaffold.FabPosition.CenterDocked,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                icon = { Icon(asset = Icons.Outlined.Check, tint = Color.White) }
            )
        },


        /**
         * Ao atribuirmos o [fabConfiguration] do Scaffold ao nosso BottomAppBar
         * ganhamos a propriedade [floatingActionButtonPosition] que foi inicializada
         * como [Scaffold.FabPosition.CenterDocked]
         *
         * Tente remover o [fabConfiguration] do BottomAppBar e executar o app novamente,
         * você vai notar uma diferença de "margin" ao redor do FloatingActionButton.
         *
         * OBS: Talvez você a previsualização do Android Studio não mostre essa diferença
         * */

        bottomAppBar = { fabConfiguration ->
            BottomAppBar(
                cutoutShape = CircleShape,
                fabConfiguration = fabConfiguration
            ) {
                IconButton(icon = { Icon(asset = Icons.Outlined.Menu) }, onClick = {})
                Spacer(Modifier.weight(1f, true))
                IconButton(icon = { Icon(asset = Icons.Outlined.Notifications) }, onClick = {})
            }
        }
    ) { /* Esse bloco é obrigatório  */ }
}
