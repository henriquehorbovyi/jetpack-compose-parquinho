package io.henriquehorbovyi.jetpackcomposeparquinho

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.ButtonSamples
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FindByTests {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun prepareComposable() {
        composeTestRule.setContent {
            // Vamos usar o "ButtonSamples" para os nossos testes
            ButtonSamples()
        }
    }

    @Test
    fun deveExistirUmBotaoComOTextoPronto() {
        prepareComposable()

        /**
         * Encontrando um Composable que contém o texto "Pronto"
         * e verificando se realmente existe na arvore de componentes
         *
         * Tente trocar "assertIsDisplayed()" por "assertIsNotDisplayed()"
         * para quebrar o teste, confirmando que o botão esta sendo mostrado
         * */
        composeTestRule.onNodeWithText("Pronto").assertIsDisplayed()
    }
}