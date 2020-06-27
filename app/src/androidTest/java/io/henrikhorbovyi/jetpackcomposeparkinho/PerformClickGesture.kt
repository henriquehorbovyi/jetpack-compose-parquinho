package io.henrikhorbovyi.jetpackcomposeparkinho

import androidx.compose.state
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.ui.core.TestTag
import androidx.ui.material.Checkbox
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.test.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PerformClickGesture {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun prepareComposable() {
        composeTestRule.setContent {
            val selected = state { false }
            TestTag(tag = "checkBoxTag") {
                Checkbox(
                    checked = selected.value,
                    onCheckedChange = { selected.value = it }
                )
            }
        }
    }

    @Test
    fun clicarNoCheckBox() {
        prepareComposable()

        /**
         * 1- Encontrando o CheckBox pela "test tag" definida como
         * 'checkBoxTag'
         *
         * 2- Clicando no CheckBox
         * */
        findByTag("checkBoxTag").doClick()
    }
}