package lesson_8

fun main() {
    val ingredientList = arrayOf("мука", "сахар", "масло", "яйца", "ваниль")

    println("Введите название ингредиента:")
    val ingredient = readLine().toString()

    if (ingredientList.contains(ingredient)) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}