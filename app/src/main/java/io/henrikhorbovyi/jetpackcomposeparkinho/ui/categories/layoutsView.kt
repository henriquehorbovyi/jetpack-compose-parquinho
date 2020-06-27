package io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories

import androidx.compose.Composable
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Categories
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SamplesView
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.launchActivity

class LayoutsActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        SamplesView(Categories.layouts) { launchActivity(it.clazz) }
    }

    @Composable
    @Preview("layoutsPreview")
    override fun preview() {
        SamplesView(Categories.layouts)
    }
}