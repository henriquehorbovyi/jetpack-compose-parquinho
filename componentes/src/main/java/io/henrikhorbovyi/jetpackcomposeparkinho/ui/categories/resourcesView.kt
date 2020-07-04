package io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories

import androidx.compose.Composable
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Categories
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentsView
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.launchActivity

class ResourcesActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        ComponentsView(Categories.resources) { launchActivity(it.clazz) }
    }

    @Composable
    @Preview("resourcesPreview")
    override fun preview() {
        ComponentsView(Categories.resources)
    }
}