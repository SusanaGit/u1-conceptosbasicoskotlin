/*
Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños. La variable
numberOfAdults contiene la cantidad de adultos en el grupo, y la variable numberOfKids, la cantidad de niños.

fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?

¿Qué sucede cuando usas el operador + en dos cadenas?

El código funciona y, además, imprime algunos resultados, pero los resultados no muestran la cantidad total de
personas que asistirán a la fiesta. ¿Puedes encontrar el problema del código y corregirlo de modo que imprima este
resultado?
 */

package conceptosbasicoskotlin

class ConcatenacionStrings {
}

fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

}