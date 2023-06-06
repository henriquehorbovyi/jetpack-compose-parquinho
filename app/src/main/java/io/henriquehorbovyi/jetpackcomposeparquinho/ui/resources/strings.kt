package io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import io.henriquehorbovyi.jetpackcomposeparquinho.R
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun StringsSample() {
    Center {
        Text(stringResource(id = R.string.app_name), color = Color.Black, fontSize = 22.sp)
    }
}