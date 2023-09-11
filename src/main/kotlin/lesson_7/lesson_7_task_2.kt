package lesson_7

fun main() {

    do {
        val randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode")
        println("- Введите код чтобы авторизоваться")
        val entheringCode = readln().toInt()
        if (entheringCode == randomCode) {
            println("Добро пожаловать!")
            return
        }
    } while (entheringCode != randomCode)

}