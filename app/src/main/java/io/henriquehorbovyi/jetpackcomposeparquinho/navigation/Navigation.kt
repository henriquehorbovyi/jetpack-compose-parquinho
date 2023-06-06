package io.henriquehorbovyi.jetpackcomposeparquinho.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import io.henriquehorbovyi.jetpackcomposeparquinho.data.categories
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.CategoriesScreen
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.CategoryDetail
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.SampleDetail

fun NavGraphBuilder.categoriesGraph(navController: NavController) {
    composable(route = "categories", content = {
        CategoriesScreen(
            categories = categories,
            onCategoryClicked = { route -> navController.navigate(route) }
        )
    })

    composable(
        route = "categories/{categoryIndex}",
        arguments = listOf(
            navArgument("categoryIndex") { type = NavType.IntType },
        )
    ) { navBackStackEntry ->
        CategoryDetail(
            categoryIndex = navBackStackEntry.arguments?.getInt("categoryIndex") ?: 0,
            onSampleClicked = { route -> navController.navigate(route) }
        )
    }

    composable(
        route = "categories/{categoryIndex}/{sampleIndex}",
        arguments = listOf(
            navArgument("categoryIndex") { type = NavType.IntType },
            navArgument("sampleIndex") { type = NavType.IntType }
        )

    ) { navBackStackEntry ->
        SampleDetail(
            categoryIndex = navBackStackEntry.arguments?.getInt("categoryIndex") ?: 0,
            sampleIndex = navBackStackEntry.arguments?.getInt("sampleIndex") ?: 0
        )
    }
}
