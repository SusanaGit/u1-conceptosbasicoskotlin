/*
En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.

La función main() contiene un error de compilación:
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}

¿Puedes corregir el error de modo que el programa imprima este resultado?
10 + 5 = 15
 */

package conceptosbasicoskotlin

class OpMatematicasBasicas {
}

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = " + result)
}