package lesson_5

fun main() {
    println("Для победы введите первое число: ")
    val guessNumber1 = readln().toInt()
    println("Для победы введите второе число: ")
    val guessNumber2 = readln().toInt()

    if ((guessNumber1 == WIN_NUMBER1 && guessNumber2 == WIN_NUMBER2) ||
        (guessNumber1 == WIN_NUMBER2 && guessNumber2 == WIN_NUMBER1))
    {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((guessNumber1 == WIN_NUMBER1 || guessNumber2 == WIN_NUMBER2)) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача! Крутите барабан")
    println("Выйгрышные числа: $WIN_NUMBER1,$WIN_NUMBER2")
}

const val WIN_NUMBER1 = 18
const val WIN_NUMBER2 = 4