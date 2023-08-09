package lesson_4

fun main() {

    var bookingToday = 13
    var bookingTomorow = 9

    println("Доступность столиков на сегодня: ${bookingToday != TABLE}\n" +
            "Доступность столиков на завтра: ${bookingTomorow != TABLE}")
}

const val TABLE = 13