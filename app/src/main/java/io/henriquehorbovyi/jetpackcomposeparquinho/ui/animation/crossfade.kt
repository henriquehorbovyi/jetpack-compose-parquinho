package io.henriquehorbovyi.jetpackcomposeparquinho.ui.animation

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun CrossfadeSample() {
    Center {
        SimpleTextCrossfade()
        ColorCrossfade()
    }
}

@Composable
private fun SimpleTextCrossfade() {
    val greetings = listOf("Olá mundo!", "Olá Androiders \uD83D\uDE0B")
    var currentString by remember { mutableStateOf(greetings[0]) }
    /**
     * Nesse exemplo estamos alterando um texto cada vez que o usuário
     * clicar no botão [Animar].
     *
     * A função [Crossfade] vai tomar conta de deixar essa transição
     * entre textos um pouco mais suave :)
     * */
    Center(modifier = Modifier.height(160.dp)) {
        Crossfade(targetState = currentString, label = "textCrossFade") {
            Text(it, fontSize = 28.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            content = { Text("Animar") },
            onClick = {
                currentString = if (currentString == greetings[0]) greetings[1] else greetings[0]
            }
        )
    }
}

@Composable
private fun ColorCrossfade() {
    val colors = listOf(Color.Red, Color.Green)
    var currentColor by remember { mutableStateOf(colors[0]) }

    /**
     * Podemos passar um [androidx.animation.AnimationSpec] para a função Crossfade,
     * nesse caso estou provendo um [tween] e estou alterando a
     * propriedade [duration] para 2000 milissegundos, essa será
     * a duração da nossa transição de cores.
     * */
    val animation = tween<Float>(durationMillis = 2000)

    Crossfade(targetState = currentColor, label = "colorCrossFade", animationSpec = animation) { color ->
        Box(
            Modifier
                .size(120.dp)
                .background(color)
                .clip(RoundedCornerShape(8.dp)),
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    Button(content = { Text("Mudar a cor") }, onClick = {
        currentColor = if (currentColor == colors[0]) colors[1] else colors[0]
    })
}