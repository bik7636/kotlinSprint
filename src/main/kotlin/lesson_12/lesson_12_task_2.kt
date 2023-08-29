package lesson_12

fun main() {
    val currentWeather = Weather2(30, 22, false, 702)
    currentWeather.showWeather()

    val currentWeather2 = Weather2(16, 8, true, 580)
    currentWeather2.showWeather()

    val currentWeather3 = Weather2(22, 15, false, 653)
    currentWeather3.showWeather()

}

class Weather2(
    _dayTimeTemperature: Int,
    _nightTimeTemperature: Int,
    _isRain: Boolean,
    _atmosphericPressure: Int
) {
    var dayTimeTemperature = _dayTimeTemperature
    var nightTimeTemperature = _nightTimeTemperature
    var isRain = _isRain
    var atmosphericPressure = _atmosphericPressure

    fun showWeather() {
        println(
            "is weather today: t day = $dayTimeTemperature," +
                    " t night = $nightTimeTemperature, rain = $isRain, atmos.pressure = $atmosphericPressure"
        )
    }
}