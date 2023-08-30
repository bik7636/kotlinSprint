package lesson_11

fun main() {
    val user01 = User01(1, "Alex", "qwerty", "kotlin@gmail.com")
    val user02 = User01(2, "Dart", "Weider", "galaxy@gmail.com")
    println("id = ${user01.id}")
    println("login = ${user01.login}")
    println("password = ${user01.password}")
    println("email = ${user01.email}")

    println()

    println("id = ${user02.id}")
    println("login = ${user02.login}")
    println("password = ${user02.password}")
    println("email = ${user02.email}")
}

class User(val id: Int, val login: String, val password: String, val email: String) {

}