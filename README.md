# ![](https://img.shields.io/badge/Kotlin-1.3.72-green.svg) ![](https://img.shields.io/badge/Compose-dev12-green.svg)

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

## [Fundação](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation)

- [Text](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation/text.kt)

- [Box](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/foundation/box.kt)

## [Layout](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout)

- [Row](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/row.kt)

- [Column](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/layout/column.kt)

- Stack

- HorizontalScroller

- VerticalScroller



## [Material](https://github.com/henrikhorbovyi/JetpackComposeParkinho/tree/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material)

- Scaffold

- [Floating Action Button](https://github.com/henrikhorbovyi/JetpackComposeParkinho/blob/master/app/src/main/java/io/henrikhorbovyi/jetpackcomposeparkinho/ui/material/floatingActionButton.kt)

- Bottom Navigation Bar

- Toolbar
