package lesson_4

fun main() {

    val trainingDay = 1
    val legsMuscles = 1
    val armMuscles = 0
    val backMuscles = 1
    val pressMuscles = 0

    val traning = (trainingDay % 2 >= legsMuscles && trainingDay % 2 >= backMuscles)
    val traning2 = (trainingDay % 2 <= armMuscles && trainingDay % 2 <= pressMuscles)

    println("""
        Упражнения для рук: $traning
        Упражнения для ног: $traning2
        Упражнения для спины: $traning2
        Упражнения для пресса: $traning
    """.trimIndent())
}