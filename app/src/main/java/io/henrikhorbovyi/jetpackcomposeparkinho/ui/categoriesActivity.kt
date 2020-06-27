package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Sample
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories.*

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleCategories { launchActivity(it.clazz) }
            }
        }
    }
}

@Composable
fun SampleCategories(onCategoryClicked: (Sample) -> Unit) {
    val sampleCategories = listOf(
        Sample(name = "Animações", clazz = AnimationsActivity::class),
        Sample(name = "Fundação", clazz = FoundationActivity::class),
        Sample(name = "Layouts", clazz = LayoutsActivity::class),
        Sample(name = "Material", clazz = MaterialActivity::class),
        Sample(name = "Resources", clazz = ResourcesActivity::class)
    )

    AdapterList(data = sampleCategories) {
        ListItem(text = it.name, onClick = { onCategoryClicked(it) })
    }
}
