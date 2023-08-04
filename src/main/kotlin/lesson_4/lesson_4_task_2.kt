package lesson_4

fun main() {

    var averageKG = 50
    var averageLiters = 100

    var res =  (averageKG >= cargoMinKG && averageKG <= cargoMaxKG) && (averageLiters < cargoMaxLiters)



    print("Груз с весом $averageKG кг и объемом $averageLiters л соответствует категории 'Average': $res")

}

const val cargoMinKG = 35
const val cargoMaxKG = 100
const val cargoMaxLiters = 100
