package lesson_9

fun main() {
    val ingridients = mutableListOf(2, 50, 15)
    println("Какое количество порций необходимо?")
    val portions = readln().toInt()
    val egg = ingridients[0] * portions
    val milk = ingridients[1] * portions
    val butter = ingridients[2] * portions
    println("На $portions порций вам понадобится: Яиц – $egg шт, молока – $milk мл, сливочного масла - $butter гр")
}