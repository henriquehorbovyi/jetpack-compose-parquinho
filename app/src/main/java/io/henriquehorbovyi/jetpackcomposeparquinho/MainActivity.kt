package io.henriquehorbovyi.jetpackcomposeparquinho

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import io.henriquehorbovyi.jetpackcomposeparquinho.navigation.categoriesGraph
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.theme.JetpackComposeParquinhoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeParquinhoTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "categories") {
        categoriesGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeParquinhoTheme {
        App()
    }
}