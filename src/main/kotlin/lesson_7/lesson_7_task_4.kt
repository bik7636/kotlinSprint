package lesson_7

fun main() {
    println("Сколько секунд надо засечь?")
    val inputSecond = readln().toInt()
    for (i in inputSecond downTo 0) {
        println("Осталось $i сек.")
        Thread.sleep(1000)
    }
    println("Время вышло")
}