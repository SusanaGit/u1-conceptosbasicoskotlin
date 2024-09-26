/*
Este programa muestra el salario total que recibe un empleado este mes. El salario total se divide en dos partes: la
variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una
bonificación adicional otorgada al empleado.

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
¿Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?
 */

package conceptosbasicoskotlin

class FormatoMensajes {
}

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}