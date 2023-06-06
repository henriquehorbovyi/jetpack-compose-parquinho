package io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun ScrollableRowSamples() {
    Center {
        Center(
            Modifier
                .size(200.dp)
                .background(Color.Black)
        ) {
            Text("Role as cores", color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {
                Box(modifier = Modifier.size(64.dp).background(Color.Yellow))
                Box(modifier = Modifier.size(64.dp).background(Color.Green))
                Box(modifier = Modifier.size(64.dp).background(Color.Blue))
                Box(modifier = Modifier.size(64.dp).background(Color.Red))
                Box(modifier = Modifier.size(64.dp).background(Color.Cyan))
                Box(modifier = Modifier.size(64.dp).background(Color.White))
                Box(modifier = Modifier.size(64.dp).background(Color.Yellow))
            }
        }
    }
}