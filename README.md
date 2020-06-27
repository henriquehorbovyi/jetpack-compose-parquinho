# ![](https://img.shields.io/badge/Kotlin-1.3.72-green.svg) ![](https://img.shields.io/badge/Compose-dev13-green.svg)

# Jetpack Compose Parkinho

O objetivo do **Parkinho** é criar uma documentação sobre o [Jetpack Compose](https://developer.android.com/jetpack/compose) totalmete em Português(BR)  :brazil:, ajudando a disseminar o conhecimento entre a comunidade Brasileira.  

# O que é o JetPack Compose? :thinking:

*"O Jetpack Compose é um kit de ferramentas moderno para a criação de UI nativa do Android. O Jetpack Compose simplifica e acelera o desenvolvimento da interface do usuário no Android com menos código, ferramentas poderosas e APIs intuitivas em Kotlin."*

# Como começar? :rocket:

1. É necessário estar utilizando o [Android Studio 4.1+ Canário](https://developer.android.com/studio/preview)

2. Ao criar um novo projeto, selecione `Compose Activity`  

3. **Bonus**: Para utilizar as versões acima da `0.1.0-dev10` é preciso colar o seguinte trecho de código no seu `build.gradle (do modulo app)`
   
   ```groovy
   buildFeatures {
       compose true
   }
   
   composeOptions {
       kotlinCompilerVersion "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
       kotlinCompilerExtensionVersion composeVersion // para versões >= '0.1.0-dev10' 
   }
   ```

# Componentes

## [Animações](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/animation)

- [Crossfade](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/animation/crossfade.kt)

- Valores Animados 

## [Fundação](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation)

- [Text](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation/text.kt)

- [Box](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation/box.kt)

## [Layout](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout)

- [Row](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/row.kt)

- [Column](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/column.kt)

- [Stack](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/stack.kt)

- [HorizontalScroller](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/horizontalScroller.kt)

- [VerticalScroller](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/verticalScroller.kt)

## [Material](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material)

- [AlertDialog](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/alertDialog.kt)

- [Bottom App Bar](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/bottomAppBar.kt)

- [Bottom Navigation](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/bottomNavigation.kt)

- [Button](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/button.kt)

- [Card](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/card.kt)

- [Checkbox](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/checkBox.kt)

- [Divider](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/divider.kt)

- [Floating Action Button](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/floatingActionButton.kt)

- [Progress](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/progress.kt)

- [Radio Button](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/radioButton.kt)

- [Scaffold](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/scaffold.kt)

- [Slider](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/slider.kt)

- [Snackbar](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/snackbar.kt)

- [Switch](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/switch.kt)

- [TextField](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/textField.kt)

- [Top App Bar](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/topAppBar.kt)

## [Resources](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/resources)

- [Color](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/resources/colors.kt)

- [Drawable](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/resources/drawables.kt)

- [String](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/resources/strings.kt)

## [Test](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/androidTest/java/io/henrikhorbovyi/jetpackcomposeparkinho)

- [Executando Cliques](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/androidTest/java/io/henrikhorbovyi/jetpackcomposeparkinho/PerformClickGesture.kt)

- Click Assertion

- [Encontrando Composables nos Testes](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/androidTest/java/io/henrikhorbovyi/jetpackcomposeparkinho/material/FindByTests.kt)

# Outras Referências

## Artigos

- [ Jetpack Compose: o framework de UI do Android para os próximos 10 anos](https://medium.com/@nglauber/jetpack-compose-o-framework-de-ui-do-android-para-os-pr%C3%B3ximos-10-anos-e19adf28e57e) **por [nglauber](https://github.com/nglauber)**

- [Jetpack Compose Part II: async data, tabs, scroller, fab, state, …](https://medium.com/@nglauber/jetpack-compose-part-ii-async-data-tabs-scroller-fab-state-efc8e267b914) **por [nglauber](https://github.com/nglauber)**

## Vídeos

- [Jetpack Compose Tutorial - O Toolkit UI Android Moderno](https://www.youtube.com/watch?v=ueqVGkMMhIY) **por [tiago-aguiar](https://github.com/tiago-aguiar)**
