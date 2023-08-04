package lesson_4

fun main() {
    var sunyDay: Boolean = true
    var awningOpen: Boolean = true
    var airHumidity = 20
    var currentTimeYear = "зима"
    val conditions = (sunyDay == true && awningOpen == true) && (airHumidity == 20 && currentTimeYear == "не зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}