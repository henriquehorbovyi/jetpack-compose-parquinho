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
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.henrikhorbovyi.jetpackcomposeparkinho.data.Sample
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.BoxActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.TextActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.ColumnActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.RowActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.FloatingActionButtonActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.SnackBarActivity

class SamplesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleListView(
                    onSampleClicked = {
                        launchActivity(it.clazz)
                    })
            }
        }
    }
}

@Composable
fun SampleListView(onSampleClicked: (Sample) -> Unit = {}) {
    val samples = listOf(
        Sample(
            name = "Text",
            clazz = TextActivity::class
        ),
        Sample(
            name = "Box",
            clazz = BoxActivity::class
        ),
        Sample(
            name = "Row",
            clazz = RowActivity::class
        ),
        Sample(
            name = "Column",
            clazz = ColumnActivity::class
        ),
        Sample(
            name = "Floating Action Button",
            clazz = FloatingActionButtonActivity::class
        ),
        Sample(
            name = "SnackBar",
            clazz = SnackBarActivity::class
        )
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
