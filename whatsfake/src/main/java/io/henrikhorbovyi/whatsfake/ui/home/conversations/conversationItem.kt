package io.henrikhorbovyi.whatsfake.ui.home.conversations

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorPainter
import androidx.ui.layout.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Check
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import coil.request.GetRequest
import coil.transform.CircleCropTransformation
import dev.chrisbanes.accompanist.coil.CoilImageWithCrossfade
import io.henrikhorbovyi.whatsfake.data.Message
import io.henrikhorbovyi.whatsfake.theme.secondary

@Composable
fun ConversationItem(message: Message, onClick: (Message) -> Unit) {

    Box(modifier = Modifier.clickable(onClick = { onClick(message) })) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(72.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalGravity = ContentGravity.CenterVertically
        ) {

            CoilImageWithCrossfade(
                request = GetRequest.Builder(ContextAmbient.current)
                    .data(message.sender.pictureUrl)
                    .transformations(CircleCropTransformation())
                    .build(),
                modifier = Modifier.preferredSize(68.dp, 68.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = message.sender.name,
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(text = message.text, color = Color.Gray, fontSize = 14.sp)
                }
                Column(
                    horizontalGravity = Alignment.CenterHorizontally
                ) {
                    val statusColor = if (message.unseen) secondary else Color.Gray

                    Text(
                        "15:00",
                        color = statusColor,
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(6.dp))
                    if (message.unseen) {
                        Row(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .drawBackground(statusColor),
                            verticalGravity = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                "2",
                                color = Color.White,
                                fontSize = 14.sp
                            )
                        }
                    } else {
                        Icon(
                            painter = VectorPainter(asset = Icons.Default.Check),
                            tint = statusColor
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}