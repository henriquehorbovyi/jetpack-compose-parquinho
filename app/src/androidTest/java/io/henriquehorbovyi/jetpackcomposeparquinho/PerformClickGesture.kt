package io.henriquehorbovyi.jetpackcomposeparquinho

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PerformClickGesture {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun prepareComposable() {
        composeTestRule.setContent {
            var selected by remember { mutableStateOf(false) }
            /**
             * 'testTag("suaTag")' fará com que seu composable seja encontrado
             * de forma facil e direta nos seus testes.
             * */
            Checkbox(
                checked = selected,
                onCheckedChange = { selected = it },
                modifier = Modifier.testTag("checkBoxTag")
            )
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
        composeTestRule.onNodeWithTag("checkBoxTag").performClick()
    }
}