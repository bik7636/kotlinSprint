package lesson_4

fun main() {
    var isSunny = true
    var isAwningOpen = true
    var airHumidity = 20
    var currentTimeYear = "зима"
    val conditions = (ISSUNNY == isSunny && ISAWNINGOPEN == isAwningOpen) &&
                     (AIRHUMIDITY == airHumidity && CURRENTTIMEYEAR == currentTimeYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}

const val ISSUNNY = true
const val ISAWNINGOPEN = true
const val AIRHUMIDITY = 20
const val CURRENTTIMEYEAR = "не зима"