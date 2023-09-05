package lesson_15

fun main() {
    val temperatureMessage = TemperatureMessage("23")
    temperatureMessage.connectToServer()
    temperatureMessage.sendData()
    println()

    val precipitationMessage = PrecipitationMessage("10mm")
    precipitationMessage.connectToServer()
    precipitationMessage.sendData()
}

abstract class BaseMessage {

    abstract val data: String
    abstract fun connectToServer()

    abstract fun sendData()

}

class TemperatureMessage(override val data: String) : BaseMessage() {
    override fun connectToServer() {
        println("Соединение с сервером...")
    }

    override fun sendData() {
        println("Отправка данных об осадках: $data")
    }

}

class PrecipitationMessage(override val data: String) : BaseMessage() {
    override fun connectToServer() {
        println("Соединение с сервером...")
    }

    override fun sendData() {
        println("Отправка данных о температуре: $data")
    }

}