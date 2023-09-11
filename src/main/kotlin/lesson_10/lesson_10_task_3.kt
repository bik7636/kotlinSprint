package lesson_10

import java.lang.StringBuilder
import kotlin.random.Random

fun main() {
    println("Введите длину пароля для генерации")
    val lenghtPassword = readln().toInt()
    val password = generatePassword(lenghtPassword)
    println(password)
}

fun generatePassword(lenghtPassword: Int): String {
    val simbols = "0123456789!\"#\$%&'()*+,-./ "
    val password = StringBuilder()
    for (i in 1..lenghtPassword) {
        val index = Random.nextInt(0, simbols.length)
        password.append(simbols[index])
    }
    return password.toString()
}