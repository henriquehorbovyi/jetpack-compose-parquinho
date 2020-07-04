package io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.R
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.ComponentActivity

class StringsActivity : ComponentActivity() {

    @Composable
    override fun ComponentExample() {
        StringsSample()
    }

    @Preview("stringsPreview", showDecoration = true)
    @Composable
    override fun preview() {
        StringsSample()
    }
}

@Composable
fun StringsSample() {
    Center {
        Text(stringResource(id = R.string.app_name), color = Color.Black, fontSize = 22.sp)
    }
}