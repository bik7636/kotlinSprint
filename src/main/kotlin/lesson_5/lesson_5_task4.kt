package lesson_5

fun main() {
    println("Введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа: ")
    val userName = readln()
    if (userName != USER_NAME) {
        println("Похоже Вам надо зарегистрироваться")
    } else if (userName == USER_NAME) {
        println("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD) {
            println("Ваши данные проверены, и о, чудо, они верны")
            println("Вам разрешено входить на борт корабля")
        }
    }
}

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"