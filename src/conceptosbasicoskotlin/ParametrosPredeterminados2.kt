/*
Bien hecho. Mostraste el mensaje. Sin embargo, en algunos escenarios, notas que no puedes determinar el sistema
operativo del usuario. En esos casos, deberás especificar el nombre del sistema operativo como Unknown OS.
Puedes optimizar aún más el código para que no necesites pasar el argumento Unknown OS cada vez que se llame a la
función.

¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima este resultado?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com.

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.
 */

package conceptosbasicoskotlin

class ParametrosPredeterminados2 {
}

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage2(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage2(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage2(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage2(operatingSystem: String, emailId: String) {
    println("There's a new sign-in request on " + operatingSystem + " for your Google Account " + emailId + ".")
}

fun displayAlertMessage2(emailId: String) {
    println("There's a new sign-in request on Unknown OS for your Google Account " + emailId + ".")
}