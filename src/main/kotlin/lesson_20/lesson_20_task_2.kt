package lesson_20

fun main() {
    val player = Player("hero", 50, 100)

    val healingPotion: (Int) -> Unit = { currentHealth ->
        val healthAmount = player.maxHealth - currentHealth
        player.currentHealth = player.maxHealth
        println("игрок ${player.name} восстановил $healthAmount единиц здоровья")
    }

    healingPotion(20)
    println("Текущее здоровье: ${player.currentHealth}")
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)