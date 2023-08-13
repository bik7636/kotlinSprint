package lesson_7

import java.lang.StringBuilder

fun main() {
    val password = StringBuilder()

    for (i in 0..2) {
        val randomNumber = (1..9).random()
        val randomSimbol = ('a'..'z').random()
        password.append(randomNumber)
        password.append(randomSimbol)
    }
    println(password)
}