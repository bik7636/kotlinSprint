package lesson_20

fun main() {
    val userName = "alex"

    val userGreeting: () -> Unit = {
        println("С наступающим Новым Годом, $userName!")
    }
    userGreeting.invoke()

}