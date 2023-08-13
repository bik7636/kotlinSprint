package lesson_7

fun main() {

    do {
        for (i in 0 until 1) {
            val randomCode = (1000..9999).random()
            println("Ваш код авторизации: $randomCode")
            println("- Введите код чтобы авторизоваться")
            val entheringCode = readln().toInt()
            if (entheringCode == randomCode) {
                println("Добро пожаловать!")
                return
            }
        }
    } while (true)
}
