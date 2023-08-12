package lesson_6

fun main() {
    val randomNumber = (1..9).random()
    var count = 5
    println("Нужно угадать число в промежутке от 1 до 9")

    while (count > 0) {
        println("Ваше число: ")
        val guessNumber = readln().toInt()
        if (guessNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        }
        else println("Неверно\n Количество попыток: ${--count}")
    }
    println("Было загадано число $randomNumber")
}