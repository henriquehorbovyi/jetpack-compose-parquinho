package io.henrikhorbovyi.jetpackcomposeparkinho.ui.animation

import androidx.compose.Composable
import androidx.compose.onCommit
import androidx.compose.state
import androidx.ui.animation.animatedColor
import androidx.ui.animation.animatedFloat
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.clickable
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class AnimatedValuesActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        Center {
            AnimatedValuesSamples()
        }
    }

    @Composable
    @Preview("animatedValues", showDecoration = true)
    override fun preview() {
        Center {
            AnimatedValuesSamples()
        }
    }
}


@Composable
fun AnimatedValuesSamples() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        AnimatedColorSample()
        AnimatedFloatSample()
    }
}

@Composable
fun AnimatedFloatSample() {
    val (isExpanded, onChangedExpanded) = state { true }

    /**
     * Se 'isExpanded' for 'true' 'boxHeight' recebe uma animação
     * com valor inicial de 200f, caso contrário recebe uma animação
     * com valor inicial de 50f.
     *
     * Ao ser alterado o valor de 'boxHeight' vai refletir no tamanho
     * da nossa caixa [Box], completando a nossa animaçáo
     * */
    val boxHeight = if (isExpanded) animatedFloat(initVal = 200f) else animatedFloat(initVal = 50f)
    Box(
        backgroundColor = Color.Green,
        modifier = Modifier
            .width(200.dp)
            .preferredHeight(boxHeight.value.dp)
            .clickable(onClick = {
                /**
                 * Ao clicar na minha caixa [Box] o estado é invertido
                 * */
                onChangedExpanded(!isExpanded)
            })
    )
}

@Composable
fun AnimatedColorSample() {

    val (isColored, onColorChanged) = state { true }

    /**
     * Se 'isColored' for 'true' 'background' recebe uma animação
     * com o valor inicial de Color.Green, caso contrário recebe uma animação
     * com valor inicial de Color.Grey
     *
     * Ao ser alterado o valor de 'background' vai refletir na cor
     * da nossa caixa [Box], completando a nossa animaçáo
     * */
    val background = if (isColored)
        animatedColor(initVal = Color.Red)
    else
        animatedColor(initVal = Color.Gray)

    Box(
        backgroundColor = background.value,
        modifier = Modifier
            .width(200.dp)
            .preferredHeight(200.dp)
            .clickable(onClick = {
                /**
                 * Ao clicar na minha caixa [Box] o estado é invertido
                 * e a cor é alterada
                 * */
                onColorChanged(!isColored)
            })
    )
}