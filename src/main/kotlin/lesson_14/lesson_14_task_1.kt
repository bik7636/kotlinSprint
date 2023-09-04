package lesson_14

fun main() {
    val standartShip = StandartShip("Стандарт", 60, 5)
    standartShip.findSpeed()
    standartShip.boxesTransportation()
}

class StandartShip(val name: String, val speed: Int, val capacity: Int) {
    fun findSpeed() {
    println("Корабль $name движется со скоростью: $speed")
    }

    fun boxesTransportation() {
    println("Корабль $name вмещает груз до: $capacity ящиков")
    }
}