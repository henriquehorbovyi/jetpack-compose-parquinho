package io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories

import androidx.compose.Composable
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Categories
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentsView
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.launchActivity

class AnimationsActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        ComponentsView(Categories.animations) { launchActivity(it.clazz) }
    }

    @Composable
    @Preview("animationsPreview")
    override fun preview() {
        ComponentsView(Categories.animations)
    }
}