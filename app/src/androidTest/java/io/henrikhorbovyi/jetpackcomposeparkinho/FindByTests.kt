package io.henrikhorbovyi.jetpackcomposeparkinho

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.ui.test.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.AlertSample
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.ButtonSamples
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
        findByText("Pronto").assertIsDisplayed()
    }
}