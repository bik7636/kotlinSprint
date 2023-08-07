package lesson_5

import java.util.*

fun main() {

    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val enteringUserAge = readln().toInt()
    val userYearBirth = year - enteringUserAge

    if (userYearBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}

const val AGE_OF_MAJORITY = 18