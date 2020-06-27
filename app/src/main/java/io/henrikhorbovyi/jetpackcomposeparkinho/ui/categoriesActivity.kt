package io.henrikhorbovyi.jetpackcomposeparkinho.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Sample
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories.*

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    Text("Categorias", style = TitleStyle(), modifier = Modifier.padding(16.dp))
                    SampleCategories { launchActivity(it.clazz) }
                }
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
