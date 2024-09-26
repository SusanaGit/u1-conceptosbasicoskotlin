/*
Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular. Tiene una
plantilla de cadenas, que se basa en la variable discountPercentage para el porcentaje de descuento y la variable item
para el artículo en oferta. Sin embargo, existen errores de compilación en el código.

fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

¿Puedes determinar la causa raíz de esos errores y corregirlos?
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
 */

package conceptosbasicoskotlin

class PlantillasStrings {
}

fun main() {
    // la variable val no puede cambiar de valor
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"

    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}