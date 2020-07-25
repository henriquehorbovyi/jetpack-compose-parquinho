package io.henrikhorbovyi.aplicativos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.layout.Column
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import io.henrikhorbovyi.aplicativos.data.App
import io.henrikhorbovyi.aplicativos.data.Mocks

class AppsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Apps { app ->
                    if (app?.clazz == null) {
                        toast("Não implementado ainda")
                    } else {
                        launchActivity(app.clazz)
                    }
                }
            }
        }
    }

    @Composable
    private fun Apps(onAppClicked: (App?) -> Unit = {}) {
        Column {
            Title(text = "Aplicativos Exemplos")
            LazyColumnItems(
                items = Mocks.allApps.sortedBy { it.name },
                itemContent = { app ->
                    ListItem(text = app.name, onClick = { onAppClicked(app) })
                }
            )
        }
    }
}