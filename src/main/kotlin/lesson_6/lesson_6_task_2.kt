package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь: ")
    val timer = readln().toInt()
    var counter = timer

    while (counter >= 0) {
        println("${counter--}")
        Thread.sleep(1000)
    }
    println("Прошло $timer секунд")
}