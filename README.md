# ![](https://img.shields.io/badge/Kotlin-1.4-green.svg) ![](https://img.shields.io/badge/Compose-dev15-green.svg)

# Jetpack Compose Parkinho

O objetivo do **Parkinho** é criar uma documentação sobre o [Jetpack Compose](https://developer.android.com/jetpack/compose) totalmete em Português(BR)  :brazil:, ajudando a disseminar o conhecimento entre a comunidade Brasileira.  

# O que é o JetPack Compose? :thinking:

*"O Jetpack Compose é um kit de ferramentas moderno para a criação de UI nativa do Android. O Jetpack Compose simplifica e acelera o desenvolvimento da interface do usuário no Android com menos código, ferramentas poderosas e APIs intuitivas em Kotlin."*

# Como começar? :rocket:

1. É necessário estar utilizando o [Android Studio 4.1+ Canário](https://developer.android.com/studio/preview)

2. Ao criar um novo projeto, selecione `Compose Activity`  

3. Para usar a ultima versão verifique se o seu  `build.gradle.kts` do modulo app tem as seguintes configurações:
   
   ```kotlin
   android {
       // [...] 
       
       compileOptions {
           sourceCompatibility = JavaVersion.VERSION_1_8
           targetCompatibility = JavaVersion.VERSION_1_8
       }
       kotlinOptions {
           jvmTarget = "1.8"
       }
       buildFeatures {
           compose = true
       }
       composeOptions {
           kotlinCompilerExtensionVersion = "1.4.3" // essa versão pode variar
       }
       packaging {
           resources {
               excludes += "/META-INF/{AL2.0,LGPL2.1}"
           }
       }
   }

   // [...]
   ```

# Componentes

## [Animações](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/animation)

- [Crossfade](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/animation/crossfade.kt)

- [Valores Animados](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/animation/animatedValues.kt) 

## [Fundação](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/foundation)

- [Text](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/foundation/text.kt)

- [Box](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/foundation/box.kt)

## [Layout](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout)

- [Constraint Layout](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/constraintLayout.kt)

- [Column](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/column.kt)

- [Row](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/row.kt)

- [Stack](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/stack.kt)

- [Scrollable Row](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/scrollableRow.kt)

- [Scrollable Column](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/layout/scrollableColumn.kt)

## [Material](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material)

- [AlertDialog](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/alertDialog.kt)

- [Bottom App Bar](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/bottomAppBar.kt)

- [Bottom Navigation](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/bottomNavigation.kt)

- [Button](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/button.kt)

- [Card](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/card.kt)

- [Checkbox](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/checkBox.kt)

- [Divider](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/divider.kt)

- [Floating Action Button](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/floatingActionButton.kt)

- [Progress](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/progress.kt)

- [Radio Button](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/radioButton.kt)

- [Scaffold](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/scaffold.kt)

- [Slider](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/slider.kt)

- [Snackbar](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/snackbar.kt)

- [Switch](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/switch.kt)

- [TextField](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/textField.kt)

- [Top App Bar](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/material/topAppBar.kt)

## [Resources](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/resources)

- [Color](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/resources/colors.kt)

- [Drawable](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/resources/drawables.kt)

- [String](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/main/java/io/henriquehorbovyi/jetpackcomposeparquinho/ui/resources/strings.kt)

## [Testes](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/tree/master/componentes/src/androidTest/java/io/henriquehorbovyi/jetpackcomposeparquinho)

- [Encontrando Composables nos Testes](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/androidTest/java/io/henriquehorbovyi/jetpackcomposeparquinho/material/FindByTests.kt)

- [Verificando Se Composable é Clicavel](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/androidTest/java/io/henriquehorbovyi/jetpackcomposeparquinho/AssertHasClickAction.kt)

- [Executando Cliques](https://github.com/henriquehorbovyi/jetpackcomposeparquinho/blob/master/componentes/src/androidTest/java/io/henriquehorbovyi/jetpackcomposeparquinho/PerformClickGesture.kt)

# Contribua :wrench:

Viu alguma coisa que pode ser melhorada ou algo a ser acrescentado? Ótimo, toda contribuição é muito bem-vinda :love_letter:. Veja abaixo como prosseguir:  

- :memo: abra uma `issue` explicando o que você pretende resolver 

- :speaking_head: vamos falar um pouco sobre o seu ponto

- :fork_and_knife: faça o `fork` do projeto para sua conta do github

- :computer: hora de codificar; ao finalizar, crie seu `pull request` :checkered_flag:

>  TODO: adicionar `readme` para boas praticas de código

# Outras Referências

## Artigos

- [ Jetpack Compose: o framework de UI do Android para os próximos 10 anos](https://medium.com/@nglauber/jetpack-compose-o-framework-de-ui-do-android-para-os-pr%C3%B3ximos-10-anos-e19adf28e57e) **por [nglauber](https://github.com/nglauber)**

- [Jetpack Compose Part II: async data, tabs, scroller, fab, state, …](https://medium.com/@nglauber/jetpack-compose-part-ii-async-data-tabs-scroller-fab-state-efc8e267b914) **por [nglauber](https://github.com/nglauber)**

## Vídeos

- [Jetpack Compose Tutorial - O Toolkit UI Android Moderno](https://www.youtube.com/watch?v=ueqVGkMMhIY) **por [tiago-aguiar](https://github.com/tiago-aguiar)**

- [GDG Curitiba - #5 Meetup Online: Jetpack Compose: a nova forma de implementar UI no Android](https://www.youtube.com/watch?v=qPS8EVzhgPY&t=3177s) **por [nglauber](https://github.com/nglauber)**
