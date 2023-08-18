package lesson_9

fun main() {
    val ingridients = mutableListOf("лук", "помидор", "яйцо")
    println("В рецепте есть базовые ингредиенты: ")
    ingridients.forEach { println(it) }
    println("- Желаете добавить еще?")
    val userResponse = readln()
    if (userResponse.equals("да", true)) {
        println("- Какой ингредиент вы хотите добавить?")
        val addUserIngredient = readln()
        ingridients.add(addUserIngredient)
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: ")
    ingridients.forEach { println(it) }
}