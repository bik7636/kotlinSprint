package lesson_12

fun main() {
    val currentWeather = Weather()
    currentWeather.dayTimeTemperature = 12
    currentWeather.nightTimeTemperature = 9
    currentWeather.isRain = true
    currentWeather.atmosphericPressure = 350
    currentWeather.showWeather()

    val currentWeather2 = Weather()
    currentWeather2.dayTimeTemperature = 29
    currentWeather2.nightTimeTemperature = 19
    currentWeather2.isRain = false
    currentWeather2.atmosphericPressure = 679
    currentWeather2.showWeather()


}

class Weather {
    var dayTimeTemperature = 30
    var nightTimeTemperature = 18
    var isRain = false
    var atmosphericPressure = 739

    fun showWeather() {
        println(
            "is weather today: t day = $dayTimeTemperature," +
                    " t night = $nightTimeTemperature, rain = $isRain, atmos.pressure = $atmosphericPressure"
        )
    }

}