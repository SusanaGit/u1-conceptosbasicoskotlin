/*
Ahora tienes una función reutilizable capaz de sumar dos números.

¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la
función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.
Pista: Piensa en la diferencia entre la suma, la resta y otras operaciones matemáticas. Comienza a trabajar en el
código de solución a partir de allí.
 */

package conceptosbasicoskotlin

class OpMatematicasBasicas3 {
}

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add2(firstNumber, secondNumber)
    val anotherResult = add2(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val resultSubstract = substract(firstNumber, secondNumber)
    val anotherResultSubstract = substract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $resultSubstract")
    println("$firstNumber - $thirdNumber = $anotherResultSubstract")
}

fun add2(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun substract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}