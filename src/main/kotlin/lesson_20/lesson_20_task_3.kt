package lesson_20

fun main() {
    val player1 = Player1(true)
    val player2 = Player1(false)
    player1.checkDoorStatus()
    player2.checkDoorStatus.invoke()
}

class Player1(val hasKey: Boolean) {
    val checkDoorStatus: () -> Unit = {
        if (hasKey) {
            println("дверь открыта")
        } else println("дверь закрыта")
    }
}