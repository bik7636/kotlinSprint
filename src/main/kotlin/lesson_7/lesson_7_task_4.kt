package lesson_7

fun main() {
    println("Сколько секунд надо засечь?")
    val inputSecond = readln().toInt()
    var count = inputSecond
    for (i in 1..inputSecond) {
        println("До конца ${count--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}