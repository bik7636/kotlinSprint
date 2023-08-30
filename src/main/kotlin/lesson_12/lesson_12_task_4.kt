package lesson_12

fun main() {
    val currentWeather = Weather4(30, 22, 702)

    val currentWeather2 = Weather4(16, 8, 580, true)

    val currentWeather4 = Weather4(22, 15, 555, true)

}

class Weather3(
    val dayTimeTemperature: Int,
    val nightTimeTemperature: Int,
    val atmosphericPressure: Int,
    val isRain: Boolean = false,
) {
    init {
        println(
            "is weather today: t day = $dayTimeTemperature," +
                    " t night = $nightTimeTemperature, rain = $isRain, atmos.pressure = $atmosphericPressure"
        )
    }
}