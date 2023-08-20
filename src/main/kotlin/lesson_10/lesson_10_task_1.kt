package lesson_10

fun main() {
    val playerResult = rollTheDice()
    println("Бросает человек: $playerResult")
    val computerResult = rollTheDice()
    println("Бросает робот: $computerResult")
    if (playerResult.first + playerResult.second > computerResult.first + computerResult.second) {
        println("Победило человечество")
    } else if (playerResult.first + playerResult.second < computerResult.first + computerResult.second) {
        println("Победила машина")
    } else {
        println("Ничья!")
    }
}

fun rollTheDice(): Pair<Int, Int> {
    val randomNumber = (1..6).random()
    val randomNumber2 = (1..6).random()
    return Pair(randomNumber, randomNumber2)
}