package io.henriquehorbovyi.jetpackcomposeparquinho.data

import androidx.compose.runtime.Composable
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.animation.AnimatedValuesSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.animation.CrossfadeSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.foundation.BoxSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.foundation.TextSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.ColumnSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.ConstraintLayoutSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.RowSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.ScrollableColumnSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.ScrollableRowSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.layout.StackSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.AlertSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.BottomAppBarSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.BottomNavigationSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.ButtonSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.CardsSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.CheckBoxSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.DividerSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.FloatingActionButtonSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.ProgressSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.ScaffoldSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.SimpleRadioGroup
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.SimpleTopAppBarSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.SliderSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.SnackBarSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.SwitchSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.material.TextFieldSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources.ColorsSamples
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources.DrawablesSample
import io.henriquehorbovyi.jetpackcomposeparquinho.ui.resources.StringsSample

data class Category(
    val name: String,
    val navRoute: String = "categories",
    val samples: List<Sample> = listOf()
)

data class Sample(
    val name: String,
    val composable: @Composable () -> Unit,
)

val animations = listOf(
    Sample(name = "Valores Animados") { AnimatedValuesSample() },
    Sample(name = "CrossFade") { CrossfadeSample() }
)

val foundation = listOf(
    Sample(name = "Box", composable = { BoxSample() }),
    Sample(name = "Text", composable = { TextSamples() })
)
val layouts = listOf(
    Sample(name = "Column", composable = { ColumnSample()}),
    Sample(name = "Row", composable = { RowSample() }),
    Sample(name = "ConstraintLayout", composable = { ConstraintLayoutSample() }),
    Sample(name = "Stack", composable = { StackSamples() }),
    Sample(name = "Scrollable Column", composable = { ScrollableColumnSample() }),
    Sample(name = "Scrollable Row", composable = { ScrollableRowSamples() })
)
val material = listOf(
    Sample(name = "AlertDialog", composable = { AlertSample() }),
    Sample(name = "BottomAppBar", composable = { BottomAppBarSample() }),
    Sample(name = "BottomNavigation", composable = { BottomNavigationSample() }),
    Sample(name = "Button", composable = { ButtonSamples() }),
    Sample(name = "Card", composable = { CardsSamples() }),
    Sample(name = "CheckBox", composable = { CheckBoxSamples() }),
    Sample(name = "Divider", composable = { DividerSamples() }),
    Sample(name = "FloatingActionButton", composable = { FloatingActionButtonSamples() }),
    Sample(name = "Progress", composable = { ProgressSamples() }),
    Sample(name = "RadioButton", composable = { SimpleRadioGroup() }),
    Sample(name = "Scaffold", composable = { ScaffoldSample() }),
    Sample(name = "Slider", composable = { SliderSamples() }),
    Sample(name = "SnackBar", composable = { SnackBarSample() }),
    Sample(name = "Switch", composable = { SwitchSamples() }),
    Sample(name = "TextField", composable = { TextFieldSamples() }),
    Sample(name = "TopAppBar", composable = { SimpleTopAppBarSample() })
)
val resources = listOf(
    Sample(name = "Colors", composable = { ColorsSamples() }),
    Sample(name = "Drawables", composable = { DrawablesSample() }),
    Sample(name = "Strings", composable = { StringsSample() })
)

val categories = listOf(
    Category(name = "Animações", samples = animations),
    Category(name = "Fundação", samples = foundation),
    Category(name = "Layouts", samples = layouts),
    Category(name = "Material", samples = material),
    Category(name = "Resources", samples = resources),
)
