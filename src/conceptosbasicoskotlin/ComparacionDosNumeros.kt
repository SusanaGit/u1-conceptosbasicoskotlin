/*
Los teléfonos celulares modernos tienen una función integrada que registra el tiempo de uso (es decir, el tiempo
que usas el teléfono cada día).

En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer.
La función acepta dos parámetros de números enteros y muestra un valor booleano.

El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos de uso de ayer.
La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. De lo contrario, muestra un valor
false.

Por ejemplo, si llamaste a la función con estos argumentos con nombre:

timeSpentToday = 300 y timeSpentYesterday = 250, la función muestra un valor true.
timeSpentToday = 300 y timeSpentYesterday = 300, la función muestra un valor false.
timeSpentToday = 200 y timeSpentYesterday = 220, la función muestra un valor false.
Pista: El operador de comparación > muestra un valor true si el valor anterior al operador es mayor que el que
aparece después de este. De lo contrario, muestra un valor false.
 */

package conceptosbasicoskotlin

class ComparacionDosNumeros {
}

fun main() {

    val minutosHoySonia = 300
    val minutosAyerSonia = 250

    val minutosHoySusana = 300
    val minutosAyerSusana = 300

    val minutosHoySandra = 200
    val minutosAyerSandra = 220

    println("¿Sonia miró hoy más el mbile que ayer?" + hoyMasMinutosQueAyer(minutosHoySonia, minutosAyerSonia))
    println(hoyMasMinutosQueAyer(minutosHoySusana, minutosAyerSusana))

    println("¿Susana miró hoy más el mbile que ayer?" + hoyMasMinutosQueAyer(minutosHoySusana, minutosAyerSusana))
    println(hoyMasMinutosQueAyer(minutosHoySusana, minutosAyerSusana))

    println("¿Sandra miró hoy más el mbile que ayer?" + hoyMasMinutosQueAyer(minutosHoySandra, minutosAyerSandra))
    println(hoyMasMinutosQueAyer(minutosHoySandra, minutosAyerSandra))

}

fun hoyMasMinutosQueAyer(minutosHoy: Int, minutosAyer: Int): Boolean {

    if (minutosHoy > minutosAyer) {
        return true
    } else {
        return false
    }
}