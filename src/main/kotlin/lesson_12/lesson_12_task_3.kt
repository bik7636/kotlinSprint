package lesson_12

fun main() {
    val currentWeather = Weather3(30, 22, 702)
    currentWeather.showWeather()

    val currentWeather2 = Weather3(16, 8, 580, true)
    currentWeather2.showWeather()

    val currentWeather3 = Weather3(22, 15, 555, true)
    currentWeather3.showWeather()

}

class Weather3(
    val dayTimeTemperature: Int,
    val nightTimeTemperature: Int,
    val atmosphericPressure: Int,
    val isRain: Boolean = false,
) {
    fun showWeather() {
        println(
            "is weather today: t day = $dayTimeTemperature," +
                    " t night = $nightTimeTemperature, rain = $isRain, atmos.pressure = $atmosphericPressure"
        )
    }
}