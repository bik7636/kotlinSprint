package lesson_6

fun main() {
    println("Придумайте логин: ")
    val userLogin = readln()
    println("Придумайте пароль: ")
    val userPassword = readln()

    do {
        println("- Для входа введите лоин: ")
        val enterLogin = readln()
        println("- Для входа введите пароль: ")
        val enterPassword = readln()
        if (enterPassword == userPassword) {
            println("Авторизация прошла успешно")
        } else println("Неверный логин или пароль\nПовторите попытку")
    } while (enterPassword != userPassword)

}