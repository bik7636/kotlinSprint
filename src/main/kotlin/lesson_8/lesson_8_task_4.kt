package lesson_8

fun main() {
    val ingridientsList = arrayOf("яйцо", "яблоко", "мука", "сахар", "соль")

    println("Список ингридиентов: ")
    for (i in ingridientsList) {
        println("Ингридиент ${ingridientsList.indexOf(i) + 1}: $i")
    }
    println("Выберете нужный ингридиент для замены: ")
    val userIngridientReplace = readln()
    if (!ingridientsList.contains(userIngridientReplace)) {
        println("Ингредиент отсутствует в списке.")
    } else {
        println("Введите новый ингредиент:")
        val addUserIngridient = readln()
        for (i in ingridientsList.indices) {
            if (ingridientsList[i] == userIngridientReplace) {
                ingridientsList[i] = addUserIngridient
                break
            }
        }
        println("Готово! Вы сохранили следующий список:")
        for (i in ingridientsList) {
            println("Ингридиент ${ingridientsList.indexOf(i) + 1}: $i")
        }
    }
}