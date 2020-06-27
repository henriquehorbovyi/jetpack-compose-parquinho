package io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories

import androidx.compose.Composable
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Categories
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SamplesView
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.launchActivity

class AnimationsActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SamplesView(Categories.animations) { launchActivity(it.clazz) }
    }

    @Composable
    @Preview("animationsPreview")
    override fun preview() {
        SamplesView(Categories.animations)
    }
}