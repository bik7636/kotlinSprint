package lesson_5

fun main() {
    println("Для победы введите первое число: ")
    val guessNumber1 = readln().toInt()
    println("Для победы введите второе число: ")
    val guessNumber2 = readln().toInt()

    if (guessNumber1 == winNumber1 && guessNumber2 == winNumber2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessNumber1 == winNumber1 || guessNumber2 == winNumber2) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача! Крутите барабан")
    println("Выйгрышные числа: $winNumber1,$winNumber2")
}

const val winNumber1 = 18
const val winNumber2 = 4