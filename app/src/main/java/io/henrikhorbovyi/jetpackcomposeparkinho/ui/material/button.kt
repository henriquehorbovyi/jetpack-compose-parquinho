package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.State
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.toast

class ButtonActivity : SampleActivity() {
    @Composable
    override fun Sample() {
        ButtonSamples(toastCallBack = { buttonName ->
            toast("$buttonName foi clicado")
        })
    }

    @Composable
    @Preview("buttonPreview", showDecoration = true)
    override fun preview() {
        ButtonSamples()
    }
}

@Composable
fun ButtonSamples(toastCallBack: (String) -> Unit = {}) {
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
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
        OutlinedButton(onClick = { toastCallBack("Outline") }, text = { Text("Detalhes") })

        TextButton(onClick = { toastCallBack("TextButton") }, text = { Text("CONFIRMAR") })

        IconButton(onClick = { toastCallBack("IconButton") }, icon = { Icon(asset = Icons.Default.Send) })

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
        val toggleState = state { false }
        IconToggleButton(
            checked = toggleState.value,
            onCheckedChange = { isChecked -> toggleState.value = isChecked },
            icon = { PickIconDependingOnState(toggleState) }
        )
    }
}

/**
 * A função abaixo foi criada apenas para demonstrar uma extração de
 * lógica que pode ser reaproveitada e também para manter uma boa legibilidade
 * */
@Composable
fun PickIconDependingOnState(toggleState: State<Boolean>) {
    if (toggleState.value) Icon(Icons.Default.Check) else Icon(Icons.Default.Lock)
}
