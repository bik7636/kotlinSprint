package lesson_5

import java.util.*

fun main() {

    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val validYearOfBirth = year - AGE_OF_MAJORITY

    println("Введите Ваш год рождения: ")
    val enteringUserAge = readln().toInt()

    if (enteringUserAge <= validYearOfBirth) {
        println("Показать экран со скрытым контентом")
    } else println("Вы слишком молод")
}

const val AGE_OF_MAJORITY = 18