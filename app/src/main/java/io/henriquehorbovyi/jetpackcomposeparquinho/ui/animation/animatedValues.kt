package io.henriquehorbovyi.jetpackcomposeparquinho.ui.animation

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedValuesSample() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        AnimatedFloatSample()
        AnimatedColorSample()
    }
}

@Composable
private fun AnimatedFloatSample() {
    var isExpanded by remember { mutableStateOf(true) }

    /**
     * Se 'isExpanded' for 'true' 'boxHeight' recebe uma animação
     * com valor inicial de 200f, caso contrário recebe uma animação
     * com valor inicial de 50f.
     *
     * Ao ser alterado o valor de 'boxHeight' vai refletir no tamanho
     * da nossa caixa [Box], completando a nossa animaçáo
     * */
    val boxHeight = animateFloatAsState(
        targetValue = if (isExpanded) 200f else 50f,
        label = "boxHeightAnimation"
    )

    Column {
        Text(text = "Clique para mudar o tamanho", modifier = Modifier.padding(bottom = 16.dp))
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(boxHeight.value.dp)
                .background(Color.Green)
                .clickable(onClick = {
                    /**
                     * Ao clicar na minha caixa [Box] o estado é invertido
                     * */
                    isExpanded = !isExpanded
                })
        )
    }
}

@Composable
fun AnimatedColorSample() {

    var isColored by remember { mutableStateOf(true) }

    /**
     * Se 'isColored' for 'true' 'background' recebe uma animação
     * com o valor inicial de Color.Green, caso contrário recebe uma animação
     * com valor inicial de Color.Grey
     *
     * Ao ser alterado o valor de 'background' vai refletir na cor
     * da nossa caixa [Box], completando a nossa animaçáo
     * */
    val background = animateColorAsState(
        targetValue = if (isColored) Color.Red else Color.Blue,
        label = "backgroundColorAnimation"
    )

    Column {
        Text(text = "Clique para mudar a cor", modifier = Modifier.padding(bottom = 16.dp))
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(background.value)
                .clickable(onClick = {
                    /**
                     * Ao clicar na minha caixa [Box] o estado é invertido
                     * e a cor é alterada
                     * */
                    isColored = !isColored
                })
        )
    }
}