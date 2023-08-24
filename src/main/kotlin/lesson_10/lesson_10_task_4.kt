package lesson_10

fun main() {
    var numOfWins = 0

    do {
        val playerResult = rollTheDice()
        println("Бросает человек: $playerResult")
        val computerResult = rollTheDice()
        println("Бросает робот: $computerResult")
        if (playerResult.first + playerResult.second > computerResult.first + computerResult.second) {
            println("Победило человечество")
            numOfWins++
        } else if (playerResult.first + playerResult.second < computerResult.first + computerResult.second) {
            println("Победила машина")
        } else {
            println("Ничья!")
        }
        val playAgain = repeatGame()
    } while (playAgain)
    println("Вы выиграли $numOfWins партий")
}

fun rollTheDice(): Pair<Int, Int> {
    val randomNumber = (1..6).random()
    val randomNumber2 = (1..6).random()
    return Pair(randomNumber, randomNumber2)
}

fun repeatGame(): Boolean {
    var userAnswer: String
    do {
        println("Хотите бросить кости еще раз? \n - Введите Да или Нет")
        userAnswer = readln()
    } while (userAnswer.lowercase() != "да" && userAnswer.lowercase() != "нет")
    return userAnswer.lowercase() == "да"
}