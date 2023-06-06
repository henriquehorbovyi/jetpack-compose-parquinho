package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonSamples(toastCallBack: (String) -> Unit = {}) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        /**
         * Um botão simples.
         * Note que o lambda ao lado do Button é apenas o atributo [text] do mesmo
         * */
        Button(onClick = { toastCallBack("Button") }) { Text("Pronto") }

        /**
         * Um botão outline.
         * Note que o atributo [text] assim como no botão anterior está sendo preenchido,
         * porém dentro do corpo da própria função Button.
         * */
        OutlinedButton(onClick = { toastCallBack("Outline") }, content = { Text("Detalhes") })

        TextButton(onClick = { toastCallBack("TextButton") }, content = { Text("CONFIRMAR") })

        IconButton(
            onClick = { toastCallBack("IconButton") },
            content = { Icon(Icons.Default.Send, contentDescription = null) })

        /**
         *  Para que o ToggleButton seja funcional criamos o [toggleState] (um State<Boolean>),
         *  ele vai controlar o boolean que diz se o botão está marcado ou não.
         *
         *  A propriedade [onCheckedChange] é um lambda que nos retorna verdadeiro ou falso,
         *  então nós mudamos o [toggleState] de acordo com esse boolean.
         *
         *  Já na propridade [icon] chamamos uma função "composable" que ao passarmos o nosso
         *  [toggleState] decide se vai mostrar um icone de "Check" ou "Lock"
         * */
        var toggleState by remember { mutableStateOf(false) }
        IconToggleButton(
            checked = toggleState,
            onCheckedChange = { isChecked -> toggleState = isChecked },
            content = { PickIconDependingOnState(toggleState) }
        )
    }
}

/**
 * A função abaixo foi criada apenas para demonstrar uma extração de
 * lógica que pode ser reaproveitada e também para manter uma boa legibilidade
 * */
@Composable
fun PickIconDependingOnState(toggleState: Boolean) {
    if (toggleState)
        Icon(
            Icons.Default.Check,
            contentDescription = null
        )
    else
        Icon(Icons.Default.Lock, contentDescription = null)
}
