package lesson_9

fun main() {
    val ingridientsList = listOf("лук", "морковь", "капуста", "соль")

    println("В рецепте есть следующие ингредиенты: ")
    ingridientsList.forEach { println(it) }
}