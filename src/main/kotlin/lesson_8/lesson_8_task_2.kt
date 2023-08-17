package lesson_8

fun main() {
    val ingredientList = arrayOf("мука", "сахар", "масло", "яйца", "ваниль")

    println("Введите название ингредиента:")
    val ingredient = readLine().toString()

    for (i in ingredientList) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}