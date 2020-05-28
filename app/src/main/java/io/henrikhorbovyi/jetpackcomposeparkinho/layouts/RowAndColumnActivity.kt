package io.henrikhorbovyi.jetpackcomposeparkinho.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import io.henrikhorbovyi.jetpackcomposeparkinho.SymmetricSpacer

class RowAndColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ColumnsAndRows()
            }
        }
    }
}

@Composable
fun ColumnsAndRows() {
    Box(
        padding = 16.dp,
        backgroundColor = Color.Red
    ) {
        Column {
            SymmetricSpacer(vertical = 16.dp) {
                Text(
                    text = "Column and Row Sample",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                )
            }

            repeat(6) { index ->
                SymmetricSpacer(vertical = 8.dp) {
                    Text("Column item $index")
                }
            }

            SymmetricSpacer(vertical = 16.dp) {
                BoxWithRows()
            }
        }
    }
}


@Composable
fun BoxWithRows() {
    Box(
        padding = 16.dp,
        backgroundColor = Color.Green,
        shape = RoundedCornerShape(24.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            repeat(3) { index ->
                Text("Item row $index")
            }
        }
    }
}


@Preview(showDecoration = true)
@Composable
fun RowsAndColumn() {
    ColumnsAndRows()
}