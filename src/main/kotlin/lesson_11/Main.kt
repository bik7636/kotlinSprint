package lesson_11

fun main() {
    val user1 = User(1, "Alex", "qwerty", "kotlin@gmail.com")
    val user2 = User(2, "Dart", "Weider", "galaxy@gmail.com")
    println("id = ${user1.id}")
    println("login = ${user1.login}")
    println("password = ${user1.password}")
    println("email = ${user1.email}")

    println()

    println("id = ${user2.id}")
    println("login = ${user2.login}")
    println("password = ${user2.password}")
    println("email = ${user2.email}")
}