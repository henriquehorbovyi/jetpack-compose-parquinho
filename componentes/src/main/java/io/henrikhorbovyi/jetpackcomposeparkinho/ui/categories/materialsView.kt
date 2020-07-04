package io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories

import androidx.compose.Composable
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Categories
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentsView
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.launchActivity

class MaterialActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        ComponentsView(Categories.material) { launchActivity(it.clazz) }
    }

    @Composable
    @Preview("materialPreview")
    override fun preview() {
        ComponentsView(Categories.material)
    }
}