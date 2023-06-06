package io.henriquehorbovyi.jetpackcomposeparquinho

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class AssertHasClickAction {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun prepareComposable() {
        composeTestRule.setContent {

            /**
             * Adicionando uma ação de clique ao meu composable
             * com o modificador 'clickable()'.
             *
             * O modificador "testTag('suaTag')" é outra forma fazer
             * seu composable facil de ser encontrado nos testes
             * */
            val modifier = Modifier
                .clickable(onClick = {})
                .testTag("meuComposable")

            /**
             * Abaixo chamamos o composable 'Text' e passamos nosso
             * modificador criado nas linhas acima
             * */
            Text("Me testa, pf :D", modifier = modifier)
        }
    }

    @Test
    fun verificarSeComposableEClicavel() {
        prepareComposable()

        /**
         * Vamos encontrar o nosso composable pela "tag"
         * definida como 'meuComposable' (poderia ser qualquer texto)
         * */
        val composableEncontrado = composeTestRule.onNodeWithTag("meuComposable")

        /**
         * Vamos verificar se esse composable tem uma ação de clique
         * Obs: Tente trocar o 'assertHasClickAction' para 'assertHasNoClickAction'
         * para quebrar o teste, ja que o composable TEM uma ação de clique
         * */
        composableEncontrado.assertHasClickAction()
    }
}