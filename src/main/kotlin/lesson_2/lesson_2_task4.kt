package lesson_2

fun main() {
    val buffEffect = 20
    val crystalOre: Byte = 7
    val ironOre = 11

    println("Бонусной кристаллической руды: ${crystalOre * buffEffect / 100}")
    println("Бонусной железной руды: ${ironOre * buffEffect / 100}")
}