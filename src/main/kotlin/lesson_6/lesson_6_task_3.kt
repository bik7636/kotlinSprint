package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь: ")
    var timer = readln().toInt()

    while (timer > 0) {
        println("Осталось секунд: ${timer--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}