package io.henrikhorbovyi.jetpackcomposeparkinho.lists

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
import io.henrikhorbovyi.jetpackcomposeparkinho.Sample
import io.henrikhorbovyi.jetpackcomposeparkinho.TitleStyle
import io.henrikhorbovyi.jetpackcomposeparkinho.floatingactionbutton.FloatingActionButtonActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.launchActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.layouts.RowAndColumnActivity

class SampleListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleListView { launchActivity(it.clazz) }
            }
        }
    }
}

@Composable
fun SampleListView(onSampleClicked: (Sample) -> Unit = {}) {
    val samples = listOf(
        Sample(name = "Row and Column", clazz = RowAndColumnActivity::class),
        Sample(name = "Floating Action Button", clazz = FloatingActionButtonActivity::class)
    )
    Column {
        Text("Sample List", style = TitleStyle(), modifier = Modifier.padding(16.dp))
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
