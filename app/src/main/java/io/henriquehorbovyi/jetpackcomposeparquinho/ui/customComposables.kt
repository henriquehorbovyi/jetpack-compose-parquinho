package io.henriquehorbovyi.jetpackcomposeparquinho.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.data.Category
import io.henriquehorbovyi.jetpackcomposeparquinho.data.Sample
import io.henriquehorbovyi.jetpackcomposeparquinho.data.categories

/**
 * Esse "Composable" foi criado para facilitar algumas demonstrações
 * */
@Composable
fun Center(modifier: Modifier = Modifier, children: @Composable () -> Unit) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) { children() }
}

@Composable
fun CategoriesScreen(
    categories: List<Category>,
    onCategoryClicked: (route: String) -> Unit = { }
) {
    LazyColumn {
        item {
            Text(
                text = "Jetpack Compose Parquinho",
                modifier = Modifier.padding(all = 16.dp),
                style = MaterialTheme.typography.titleLarge
            )
        }
        items(categories.sortedBy { it.name }) { category ->
            ListItem(
                headlineContent = { Text(category.name) },
                modifier = Modifier.clickable {
                    onCategoryClicked(
                        "${category.navRoute}/${categories.indexOf(category)}"
                    )
                }
            )
        }
    }
}

@Composable
fun CategoryDetail(categoryIndex: Int, onSampleClicked: (String) -> Unit) {
    val category = categories[categoryIndex]

    LazyColumn {
        item {
            Text(
                text = category.name,
                modifier = Modifier.padding(all = 16.dp),
                style = MaterialTheme.typography.titleLarge
            )
        }
        items(category.samples) {
            val sampleIndex = category.samples.indexOf(it)
            val navRoute = "${category.navRoute}/$categoryIndex/$sampleIndex"
            ListItem(
                headlineContent = { Text(text = it.name) },
                modifier = Modifier.clickable { onSampleClicked(navRoute) }
            )
        }
    }
}

@Composable
fun SampleDetail(
    categoryIndex: Int,
    sampleIndex: Int
) {
    val sample = categories[categoryIndex].samples[sampleIndex]
    Center {
        sample.composable()
    }
}
