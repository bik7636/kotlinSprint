package lesson_4

fun main() {

    val day = 1
    val isEven = day % 2 == 1
    val isArmAndAbsDay = true
    val isLegAndBackDay = false

    println(
        """
        Упражнения для рук: ${isArmAndAbsDay == isEven}
        Упражнения для ног: ${isLegAndBackDay == isEven}
        Упражнения для спины: ${isLegAndBackDay == isEven}
        Упражнения для пресса: ${isArmAndAbsDay == isEven}
    """.trimIndent()
    )
}