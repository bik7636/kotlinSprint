package lesson_5

fun main() {
    val randomNumber = (0..100).random()
    val randomNumber2 = (0..100).random()
    println("Для победы введите первое число: ")
    val guessNumber1 = readln().toInt()
    println("Для победы введите второе число: ")
    val guessNumber2 = readln().toInt()

    if (guessNumber1 == randomNumber && guessNumber2 == randomNumber2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessNumber1 == randomNumber || guessNumber2 == randomNumber2) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача! Крутите барабан")
    println("Выйгрышные числа: $randomNumber,$randomNumber2")
}