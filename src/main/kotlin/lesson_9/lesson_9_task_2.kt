package lesson_9

fun main() {
    val ingridients = mutableListOf("лук", "помидор", "яйцо")
    println("В рецепте есть базовые ингредиенты: ")
    ingridients.forEach { println(it) }
    println("- Желаете добавить еще?")
    val addOrNo = readln()
    if (addOrNo == "да") {
        println("- Какой ингредиент вы хотите добавить?")
        val addUserIngridients = readln()
        ingridients.add(addUserIngridients)
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: ")
    ingridients.forEach { println(it) }
}