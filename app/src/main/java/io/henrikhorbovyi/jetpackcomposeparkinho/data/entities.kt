package io.henrikhorbovyi.jetpackcomposeparkinho.data

import androidx.appcompat.app.AppCompatActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.animation.CrossfadeActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.BoxActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.TextActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.ColorsActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.DrawablesActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.StringsActivity
import kotlin.reflect.KClass

data class Sample(
    val name: String,
    val clazz: KClass<out AppCompatActivity>
)

object Categories {
    val animations = listOf(
        Sample("CrossFade", clazz = CrossfadeActivity::class)
    )
    val foundation = listOf(
        Sample("Box", BoxActivity::class),
        Sample("Text", TextActivity::class)
    )
    val layouts = listOf(
        Sample("Column", ColumnActivity::class),
        Sample("Row", RowActivity::class),
        Sample("ConstraintLayout", ConstraintLayoutActivity::class),
        Sample("Stack", StackActivity::class),
        Sample("Vertical Scroller", VerticalScrollerActivity::class),
        Sample("Horizontal Scroller", HorizontalScrollerActivity::class)
    )
    val material = listOf(
        Sample("AlertDialog", AlertDialogActivity::class),
        Sample("BottomAppBar", BottomAppBarActivity::class),
        Sample("BottomNavigation", BottomNavigationActivity::class),
        Sample("Button", ButtonActivity::class),
        Sample("Card", CardActivity::class),
        Sample("CheckBox", CheckBoxActivity::class),
        Sample("Divider", DividerActivity::class),
        Sample("FloatingActionButton", FloatingActionButtonActivity::class),
        Sample("Progress", ProgressActivity::class),
        Sample("RadioButton", RadioButtonActivity::class),
        Sample("Scaffold", ScaffoldActivity::class),
        Sample("Slider", SliderActivity::class),
        Sample("SnackBar", SnackBarActivity::class),
        Sample("Switch", SwitchActivity::class),
        Sample("TextField", TextFieldActivity::class),
        Sample("TopAppBar", TopAppBarActivity::class)
    )
    val resources = listOf(
        Sample("Colors", ColorsActivity::class),
        Sample("Drawables", DrawablesActivity::class),
        Sample("Strings", StringsActivity::class)
    )
}