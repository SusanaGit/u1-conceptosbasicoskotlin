/*
Gmail tiene una función que envía notificaciones al usuario cada vez que se intenta acceder a una cuenta en un
dispositivo nuevo.

En este ejercicio, escribirás un programa que muestra un mensaje a los usuarios con esta plantilla de mensaje:
There's a new sign-in request on operatingSystem for your Google Account emailId.

Deberás implementar una función que acepte un parámetro operatingSystem y un parámetro emailId, cree un mensaje en
el formato dado y lo muestre.

Por ejemplo, si se llamó a la función con "Chrome OS" para el operatingSystem y "sample@gmail.com" para el emailId,
se debería mostrar esta cadena:
There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

*/

package conceptosbasicoskotlin

class ParametrosPredeterminados {
}

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(operatingSystem: String, emailId: String) {
    println("There's a new sign-in request on " + operatingSystem + " for your Google Account " + emailId + ".")
}