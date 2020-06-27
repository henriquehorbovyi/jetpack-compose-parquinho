package io.henrikhorbovyi.jetpackcomposeparkinho.ui.material

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.input.TextFieldValue
import androidx.ui.layout.Spacer
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.material.FilledTextField
import androidx.ui.material.OutlinedTextField
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowForward
import androidx.ui.material.icons.filled.Person
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.Center
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.SampleActivity

class TextFieldActivity : SampleActivity() {

    @Composable
    override fun Sample() {
        TextFieldSamples()
    }

    @Preview("textFieldsPreview", showDecoration = true)
    @Composable
    override fun preview() {
        TextFieldSamples()
    }
}

@Composable
fun TextFieldSamples() {

    Center {
        SimpleTextField()
        FilledTextFieldSample()
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

    val (value, onTextChanged) = state { TextFieldValue("") }

    Box(
        backgroundColor = Color.Black,
        shape = CircleShape,
        modifier = Modifier.fillMaxWidth().padding(64.dp)
    ) {
        TextField(
            value = value,
            onValueChange = onTextChanged,
            textColor = Color.Yellow,
            modifier = Modifier.padding(16.dp),
            cursorColor = Color.Yellow
        )
    }
}

@Composable
fun FilledTextFieldSample() {
    /**
     * Se você quer usar um componente pronto (estilo Material Design)
     * o [FilledTextField] é ideal
     * */

    val (value, onChanged) = state { "" }

    FilledTextField(
        value = value,
        onValueChange = onChanged,
        label = { Text("Nome") },
        shape = RoundedCornerShape(2.dp),
        leadingIcon = { Icon(Icons.Default.Person) },
        trailingIcon = { Icon(Icons.Default.ArrowForward) },
        backgroundColor = Color.LightGray,
        textStyle = TextStyle(fontSize = 18.sp, color = Color.DarkGray)
    )
}

@Composable
fun OutlineTextFieldSample() {
    val (value, onTextChanged) = state { TextFieldValue("") }

    OutlinedTextField(
        value = value,
        onValueChange = onTextChanged,
        label = { Text("Email") },
        leadingIcon = { Text("@") }
    )
}