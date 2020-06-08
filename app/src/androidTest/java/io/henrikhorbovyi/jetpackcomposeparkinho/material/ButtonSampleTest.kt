package io.henrikhorbovyi.jetpackcomposeparkinho.material

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.ui.test.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.AlertSample
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.ButtonSamples
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonSampleTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun prepareComposable() {
        composeTestRule.setContent {
            ButtonSamples()
        }
    }

    @Test
    fun DeveExistirUmBotaoComOTextoPronto() {
        prepareComposable()
        findByText("Pronto").assertExists()
    }
}