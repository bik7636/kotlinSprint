package lesson_2

fun main() {
    val hour = 60
    val departureHoursInMinutes = 9 * hour
    val departureInMinutes = 39
    val travelTime = 457
    val totalDepartureTime = departureHoursInMinutes + departureInMinutes

    val arrivalTime = (totalDepartureTime + travelTime)
    val arrivalHours =  arrivalTime / hour
    val arrivalMinutes = arrivalTime % hour
    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")

}