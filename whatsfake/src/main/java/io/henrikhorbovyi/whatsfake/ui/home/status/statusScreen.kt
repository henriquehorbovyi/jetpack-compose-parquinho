package io.henrikhorbovyi.whatsfake.ui.home.status

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.unit.dp
import io.henrikhorbovyi.whatsfake.data.Status
import io.henrikhorbovyi.whatsfake.data.User

@Composable
fun StatusView(
    status: List<Status>,
    onStatusClicked: (Status) -> Unit = {}
) {
    Column {
        NewStatusItem(
            User(
                "Henrique",
                "https://avatars2.githubusercontent.com/u/5937963?s=400&u=bd059708d407a7ddec7ed8fe9b61308a83d26ef3&v=4"
            )
        ) {

        }
        Box(
            backgroundColor = Color(0xffeaeaea),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Recent updates",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
        LazyColumnItems(items = status) {
            StatusItem(it, onClicked = onStatusClicked)
        }
    }
}