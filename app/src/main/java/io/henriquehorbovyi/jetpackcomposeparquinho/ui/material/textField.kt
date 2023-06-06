package io.henriquehorbovyi.jetpackcomposeparquinho.ui.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.Center

@Composable
fun TextFieldSamples() {

    Center {
        SimpleTextField()
        Spacer(modifier = Modifier.height(56.dp))
        OutlineTextFieldSample()
    }
}

@Composable
fun SimpleTextField() {
    /**
     * Se você quer criar o seu próprio [TextField]
     * customizado, você pode utilizar apenas o TextField
     *
     * */

    var value by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier.fillMaxWidth().padding(64.dp).background(Color.Black).clip(CircleShape)
    ) {
        TextField(
            value = value,
            onValueChange = {
               value = it
            },
            modifier = Modifier.padding(16.dp),
        )
    }
}


@Composable
fun OutlineTextFieldSample() {
    var value by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = value,
        onValueChange = { value = it },
        label = { Text("Email") },
        leadingIcon = { Text("@") }
    )
}