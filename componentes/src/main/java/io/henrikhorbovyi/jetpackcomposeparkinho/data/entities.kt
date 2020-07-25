package io.henrikhorbovyi.jetpackcomposeparkinho.data

import androidx.appcompat.app.AppCompatActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.animation.AnimatedValuesActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.animation.CrossfadeActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.categories.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.BoxActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.foundation.TextActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.layout.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.material.*
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.ColorsActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.DrawablesActivity
import io.henrikhorbovyi.jetpackcomposeparkinho.ui.resources.StringsActivity
import kotlin.reflect.KClass

data class Component(
    val name: String,
    val clazz: KClass<out AppCompatActivity>
)

object Categories {
    val all = listOf(
        Component(name = "Animações", clazz = AnimationsActivity::class),
        Component(name = "Fundação", clazz = FoundationActivity::class),
        Component(name = "Layouts", clazz = LayoutsActivity::class),
        Component(name = "Material", clazz = MaterialActivity::class),
        Component(name = "Resources", clazz = ResourcesActivity::class)
    )

    val animations = listOf(
        Component("Valores Animados", clazz = AnimatedValuesActivity::class),
        Component("CrossFade", clazz = CrossfadeActivity::class)
    )
    val foundation = listOf(
        Component("Box", BoxActivity::class),
        Component("Text", TextActivity::class)
    )
    val layouts = listOf(
        Component("Column", ColumnActivity::class),
        Component("Row", RowActivity::class),
        Component("ConstraintLayout", ConstraintLayoutActivity::class),
        Component("Stack", StackActivity::class),
        Component("Scrollable Column", ScrollableColumnActivity::class),
        Component("Scrollable Row", ScrollableRowActivity::class)
    )
    val material = listOf(
        Component("AlertDialog", AlertDialogActivity::class),
        Component("BottomAppBar", BottomAppBarActivity::class),
        Component("BottomNavigation", BottomNavigationActivity::class),
        Component("Button", ButtonActivity::class),
        Component("Card", CardActivity::class),
        Component("CheckBox", CheckBoxActivity::class),
        Component("Divider", DividerActivity::class),
        Component("FloatingActionButton", FloatingActionButtonActivity::class),
        Component("Progress", ProgressActivity::class),
        Component("RadioButton", RadioButtonActivity::class),
        Component("Scaffold", ScaffoldActivity::class),
        Component("Slider", SliderActivity::class),
        Component("SnackBar", SnackBarActivity::class),
        Component("Switch", SwitchActivity::class),
        Component("TextField", TextFieldActivity::class),
        Component("TopAppBar", TopAppBarActivity::class)
    )
    val resources = listOf(
        Component("Colors", ColorsActivity::class),
        Component("Drawables", DrawablesActivity::class),
        Component("Strings", StringsActivity::class)
    )
}