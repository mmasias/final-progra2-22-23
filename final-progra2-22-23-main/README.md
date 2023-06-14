# Examen final

Examen final de la asignatura **Programación II** del [Grado de Ingeniería Informática](https://www.uneatlantico.es/escuela-politecnica-superior/estudios-grado-oficial-en-ingenieria-informatica) la [Universidad Europea del Atlántico](https://www.uneatlantico.es).

## 📝 Instrucciones
* Cada ejercicio debe ir en un paquete y respetar el esqueleto inicial del proyecto tal como lo indicado [acá](entregas/fernandoCalvo/examen-final-p2).
* El presente examen debe desarrollarse con los conceptos de programación vistos en clase hasta la sesión anterior a este examen.
* Se deben además respetar los conceptos de código limpio:
    * Indentación.
    * Nombrado adecuado de la clase, las constantes y las variables.
    * Orden en el código.
    * Manejar un mismo idioma, como lo explicado en clase se usará Inglés.
* Para la entrega:
    * Haga un fork de éste repositorio.
    * En su repositorio, dentro de la carpeta **entregas** cree una carpeta con su nombre y apellido en formato `nombreApellido` (ejemplo: `elderBol`).
    * Publique allí su código fuente en formato compilable, el proyecto puede llamarse `examen-final-p2`.
    * Al terminar, realice un pull request a este repositorio con el título: `nombre.apellido + examen final P2`.

> **Muy importante**: no se corregirán entregas que obvien las reglas anteriormente indicadas o que se envíen fuera del plazo de entrega del examen.

## 📚 Ejercicio 1: Ahorcado
El ejercicio consiste en implementar el juego llamado “**Ahorcado**” es un juego de adivinanza de palabras o frases cuya 
finalidad es que los participantes descifran el significado de las mismas sin ser “ahorcados” por los desaciertos. 
Por cada error, se irá dibujando una parte del cuerpo, cuando esté completa esta figura, el jugador que trata de adivinar 
ya no tendrá más oportunidades y habrá perdido.

Implementar las funcionalidades basándonos en el diagrama UML planteado para que los **tests pasen satisfactoriamente**.

### Diagrama de clases
También lo encuentra en el directorio raíz del esqueleto propuesto del proyecto.
> Puede cambiar/agregar en las clases lo que considere oportuno para la resolución del ejercicio. Incluso puede agregar 
> más clases si lo considera necesario, pero no puede modificar los tests. 

![Diagrama de clases](docs/hangman-diagram-class.png)

### Tests
Los siguientes test los encontrará en el paquete `com.progra.hangman.test`

#### HangmanLogicTest
*[ ] `isGameOver()`: Validar si se ha terminado el juego
*[ ] `isWon()`: Validar si ya se ha ganado

#### UserInterfaceTest
*[ ]  `start()`: Iniciar el juego y validar que se haya cargado la cantidad de palabras definidas en el 
archivo **data/word-list.txt**.

#### WordParserTest
*[ ]  `nameParsedTest`: Ingresando una cadena de texto crear una instancia de Word y debe
  retornar con el nombre parseado.
*[ ]  `instanceParsedTest`: Dependiedo de que tipo de palabra es se crea una instancia de la clase
  específica (_**Larga**_ -> _LargeWord_, _**Mediana**_ -> _MediumWord_, _**Corta**_ -> _ShortWord_), este test debe
  parsear una cadena de texto y crear la instancia adecuada basándonos en el tipo de palabra.
*[ ]  `sizeValidatorTest`: Debe validar que la cadena de texto al parsearlo deba tener la cantidad de
  elementos necesarios para crear una instancia de `Word`.

#### WordTest
*[ ]  `shortWordTest`: Al momento de crear una instancia de `ShortWord` al validar el nivel debe
  retornar **S**.
*[ ]  `mediumWordTest`: Al momento de crear una instancia de `MediumWord` al validar el nivel
  debe retornar **M**.

## 📚 Ejercicio 2: Interfaces
Importante para realizar este ejercicio, agregue en el mismo proyecto un paquete con el
nombre de `com.progra.interfaces`.

*[ ] Crear la interfaz `AdvancedArithmetic` que contiene un método `int divisorSum(int n)`.
*[ ] La clase `Calc` implementa la interfaz `AdvancedArithmetic`. La función
`divisorSum` solo toma un número entero como entrada y devuelve la suma de todos
sus divisores, el valor de **n** será como máximo 999, caso contrario lanzar una
excepción.
* [ ] En la clase `Calc` crear función `describeDivisors(int n)` donde solo toma un número entero
como entrada y debe retornar todos sus divisores separados por comas. El valor de **n**
será como máximo 999, caso contrario lanzar una excepción. Para la excepción debe
tener dos constructores, uno con un mensaje por defecto y otro recibe como
parámetro el mensaje a mostrar.

> Todas las funciones implementadas las debe de usar en **Main** como prueba de que funcionan.

**Ejemplo**: los divisores de **6** son 1, 2, 3 y 6, por lo que `divisorSum` debería devolver 12.

**Ejemplo de entrada 0:**
``` shell
6
```
Ejemplo de salida 0:
``` shell
12
```
**Explicación**:
Divisores de 6 son 1,2,3 y 6. 1+2+3+6=12.

**Ejemplo de entrada 1**:
``` shell
1000
```
**Ejemplo de salida 1**:
``` shell
InputMaxValueException - Max value allowed is 999
```
**Explicación**:
El valor de **n** es mayor a 999, por lo que se lanza una excepción.


Para la función `describeDivisors()`

**Ejemplo de entrada 2**:
``` shell
6
```
**Ejemplo de salida 2**:
``` shell
1,2,3,6
```
**Explicación**:
Divisores de 6 son 1,2,3 y 6.

**Ejemplo de entrada 3**:
``` shell
1000
```
**Ejemplo de salida 3**:
``` shell
InputMaxValueException - Max value allowed is 999
```
**Explicación**:
El valor de **n** es mayor a 999, por lo que se lanza una excepción.


# Algunas definiciones

## Parsear / Parsing
El término se usa a menudo para describir el análisis sintáctico de la
entrada de un programa de computadora y la conversión de la misma en una forma interna que sea más fácil de procesar
para el ordenador. [Leer más...](https://www.alegsa.com.ar/Dic/parseo.php#gsc.tab=0)

Un ejemplo de una libreria muy usado en java es [Apache POI](https://poi.apache.org/text-extraction.html) que 
nos permite parsear archivos de Excel, Word, PDF, etc.

## Uso de paquetes en Java
Un paquete es un contenedor de clases, interfaces y subpaquetes. Los paquetes se utilizan para organizar 
las clases en grupos lógicos, lo que facilita su mantenimiento y uso. [Leer más...](https://www.programarya.com/Cursos/Java/Paquetes)
