package lesson_7

fun main() {
    println("Введите число: ")
    val input = readln().toInt()
    for (i in 0..input step 2) {
        println(i)
    }
}