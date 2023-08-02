package lesson_2

fun main() {
    val departureHoursInMinutes = 9 * 60
    val departureInMinutes = 39
    val travelTime = 457
    val totalDepartureTime = departureHoursInMinutes + departureInMinutes

    val arrivalTime = (totalDepartureTime + travelTime)
    val arrivalHours =  arrivalTime / 60
    val arrivalMinutes = arrivalTime % 60
    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")

}