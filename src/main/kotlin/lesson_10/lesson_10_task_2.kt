package lesson_10

fun main() {
    println("Придумайте логин: ")
    val userLogin = readln()
    println("Придумайте пароль: ")
    val userPassword = readln()
    checkingTheLength(userLogin, userPassword)
}

fun checkingTheLength(userLogin: String, userPassword: String) {
    if (userLogin.length < 4 || userPassword.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать!")
}