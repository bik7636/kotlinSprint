package lesson_12

fun main() {
    val currentWeather = Weather2(
        11,
        10,
        false,
        500
    )
    currentWeather.WeatherData()

    val currentWeather2 = Weather2(
        22,
        15,
        false,
        650
    )
    currentWeather2.WeatherData()

    val currentWeather3 = Weather2()
    currentWeather3.WeatherData()

}

class Weather2(
    var dayTimeTemperature: Int = 30,
    var nightTimeTemperature: Int = 18,
    var isRain: Boolean = false,
    var atmosphericPressure: Int = 739
) {


    fun WeatherData() {
        println(
            "is weather today: t day = $dayTimeTemperature," +
                    " t night = $nightTimeTemperature, rain = $isRain, atmos.pressure = $atmosphericPressure"
        )
    }

}