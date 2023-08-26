package lesson_11

fun main() {
    val user = Users(1, "Alex", "qwerty", "kotlin@gmail.com")

    user.saveInfoInBio()
    user.changePassword()

    println()

    user.printInfoAboutUser()

    println()
    user.sendEmail("Сижу изучаю котлин, время 01:06. Балдёж да и только")
}

class Users(val id: Int, val login: String, var password: String, val email: String, var bio: String = "") {

    fun printInfoAboutUser() {
        println("id = $id")
        println("login = $login")
        println("password = $password")
        println("email = $email")
        println("О себе: $bio")
    }

    fun saveInfoInBio(): String {
        println("Введите информацию о себе: ")
        val input = readln()
        bio = input
        return bio
    }

    fun changePassword(): String {
        var currentPassword: String
        do {
            println("Для изменения пароля введите текущий пароль: ")
            currentPassword = readln()
        } while (currentPassword != password)

        println("Введите новый пароль: ")
        val newPassword = readln()
        password = newPassword
        println("Пароль изменён")
        return password
    }

    fun sendEmail(text: String) {
        println(text)
    }
}