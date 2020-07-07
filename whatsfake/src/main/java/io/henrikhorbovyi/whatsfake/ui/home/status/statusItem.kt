package io.henrikhorbovyi.whatsfake.ui.home.status

import androidx.compose.Composable
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.preferredSize
import androidx.ui.material.ListItem
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import coil.request.GetRequest
import coil.transform.CircleCropTransformation
import dev.chrisbanes.accompanist.coil.CoilImageWithCrossfade
import io.henrikhorbovyi.whatsfake.data.Status
import io.henrikhorbovyi.whatsfake.data.User

@Composable
fun StatusItem(status: Status, onClicked: (Status) -> Unit) {
    ListItem(
        secondaryText = { Text(status.date) },
        icon = {
            CoilImageWithCrossfade(
                request = GetRequest.Builder(ContextAmbient.current)
                    .data(status.picture)
                    .transformations(CircleCropTransformation())
                    .build(),
                modifier = Modifier.preferredSize(56.dp, 56.dp)
            )
        },
        onClick = { onClicked(status) }
    ) {
        Text(status.user.name, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
    }
}

@Composable
fun NewStatusItem(user: User, onClicked: () -> Unit) {
    ListItem(
        text = {
            Text(
                "My status",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
        },
        secondaryText = { Text("Tap to add status update") },
        icon = {
            CoilImageWithCrossfade(
                request = GetRequest.Builder(ContextAmbient.current)
                    .data(user.pictureUrl)
                    .transformations(CircleCropTransformation())
                    .build(),
                modifier = Modifier.preferredSize(56.dp, 56.dp)
            )
        },
        onClick = onClicked
    )
}
