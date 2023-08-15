package lesson_8

fun main() {
    val ingredientList = arrayOf("мука", "сахар", "масло", "яйца", "ваниль")

    println("Введите название ингредиента:")
    val ingredient = readLine().toString()

    var isIngredientFound = false
    for (i in ingredientList) {
        if (i == ingredient) {
            isIngredientFound = true
            break
        }
    }

    if (isIngredientFound) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}