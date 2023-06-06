package io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.R
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun DrawablesSample() {
    Center {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            modifier = Modifier.size(180.dp),
            colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Fit,
            contentDescription = null
        )
    }
}