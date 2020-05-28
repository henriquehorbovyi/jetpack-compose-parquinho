package io.henrikhorbovyi.jetpackcomposeparkinho.lists

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import io.henrikhorbovyi.jetpackcomposeparkinho.User

class SimpleListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                UserListView()
            }
        }
    }
}

@Composable
fun UserListView() {
    User.mockedList().forEach { user ->
        ListItem(
            onClick = { Log.i("USER_SELECTED: ", "$user") },
            text = { Text(user.name) },
            secondaryText = { Text(user.phone) }
        )
    }
}

@Composable
@Preview("simpleListPreview", showDecoration = true)
fun SimpleListPreview() {
    UserListView()
}
