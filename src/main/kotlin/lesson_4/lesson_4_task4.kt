package lesson_4

fun main() {

    val day = 1
    val isArmAndAbsDay = day % 2 == 1
    val isLegAndBackDay = !isArmAndAbsDay

    println(
        """
        Упражнения для рук: $isArmAndAbsDay
        Упражнения для ног: $isLegAndBackDay
        Упражнения для спины: $isLegAndBackDay
        Упражнения для пресса: $isArmAndAbsDay
    """.trimIndent()
    )
}