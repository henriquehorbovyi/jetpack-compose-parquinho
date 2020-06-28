package io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.layout.size
import androidx.ui.layout.width
import androidx.ui.res.loadImageResource
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.R
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class DrawablesActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        DrawablesSample()
    }

    @Composable
    @Preview("drawablesPreview", showDecoration = true)
    override fun preview() {
        DrawablesSample()
    }
}

@Composable
fun DrawablesSample() {
    Center {
        Image(
            modifier = Modifier.size(180.dp),
            asset = vectorResource(id = R.drawable.ic_android),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(Color.Red)
        )
    }
}