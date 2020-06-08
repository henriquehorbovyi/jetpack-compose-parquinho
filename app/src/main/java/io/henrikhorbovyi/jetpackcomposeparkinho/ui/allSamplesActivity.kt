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
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.animation.CrossfadeActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.BoxActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.TextActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.ColumnActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.RowActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.*

class SamplesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleListView(onSampleClicked = { launchActivity(it.clazz) })
            }
        }
    }
}

@Composable
fun SampleListView(onSampleClicked: (Sample) -> Unit = {}) {
    val samples = listOf(
        Sample(
            name = "Crossfade",
            clazz = CrossfadeActivity::class
        ),
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
            name = "Alert Dialog",
            clazz = AlertDialogActivity::class
        ),
        Sample(
            name = "Bottom App Bar",
            clazz = BottomAppBarActivity::class
        ),
        Sample(
            name = "Bottom Navigation",
            clazz = BottomNavigationActivity::class
        ),
        Sample(
            name = "Button",
            clazz = ButtonActivity::class
        ),
        Sample(
            name = "Card",
            clazz = CardActivity::class
        ),
        Sample(
            name = "CheckBox",
            clazz = CheckBoxActivity::class
        ),
        Sample(
            name = "Floating Action Button",
            clazz = FloatingActionButtonActivity::class
        ),
        Sample(
            name = "Divider",
            clazz = DividerActivity::class
        ),
        Sample(
            name = "Progress",
            clazz = ProgressActivity::class
        ),
        Sample(
            name = "Radio Button",
            clazz = RadioButtonActivity::class
        ),
        Sample(
            name = "Top App Bar",
            clazz = TopAppBarActivity::class
        ),
        Sample(
            name = "SnackBar",
            clazz = SnackBarActivity::class
        ),
        Sample(
            name = "Slider",
            clazz = SliderActivity::class
        ),
        Sample(
            name = "Scaffold",
            clazz = ScaffoldActivity::class
        )
    ).sortedBy { it.name }

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
