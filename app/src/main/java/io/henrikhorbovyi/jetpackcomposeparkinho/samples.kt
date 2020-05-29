package io.henrikhorbovyi.jetpackcomposeparkinho

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
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.layout.ColumnActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.layout.RowActicity
import io.henrikhorbovyi.jetpackcomposeparkinho.material.FloatingActionButtonActivity

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleListView(onSampleClicked = {
                    launchActivity(it.clazz)
                })
            }
        }
    }
}

@Composable
fun SampleListView(onSampleClicked: (Sample) -> Unit = {}) {
    val samples = listOf(
        Sample(name = "Row", clazz = RowActicity::class),
        Sample(name = "Column", clazz = ColumnActivity::class),
        Sample(name = "Floating Action Button", clazz = FloatingActionButtonActivity::class)
    )
    Column {
        Text("Lista de Exemplos", style = TitleStyle(), modifier = Modifier.padding(16.dp))
        AdapterList(data = samples) { sample ->
            ListItem(onClick = {
                onSampleClicked(sample)
            }) {
                Text(text = sample.name)
            }
        }
    }
}

@Composable
@Preview(name = "sampleListPreview", showDecoration = true)
fun SampleListPreview() {
    SampleListView()
}
