package lesson_4

fun main() {

    var averageKG = 50
    var averageLiters = 100

    var res = (averageKG >= CARGOMINKG && averageKG <= CARGOMAXKG) && (averageLiters < CARGOMAXLITERS)

    print("Груз с весом $averageKG кг и объемом $averageLiters л соответствует категории 'Average': $res")

}

const val CARGOMINKG = 35
const val CARGOMAXKG = 100
const val CARGOMAXLITERS = 100