package lesson_5

fun main() {
    println("Для входа необходимо решить простой математический пример: 2 + 2 = ?")
    println("Введите ваш ответ: ")
    val answer = readln().toInt()

    if (answer == 4)
        println("Добро пожаловать!")
    else println("Доступ запрещен")
}