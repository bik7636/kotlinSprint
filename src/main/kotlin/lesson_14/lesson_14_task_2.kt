package lesson_14

fun main() {
    val standartShip = StandartShip1("Стандарт", 60, 5)
    standartShip.findSpeed()
    standartShip.boxesTransportation()
    println()

    val icebreaker = IceBreaker("Ледокол", 20, 2)
    icebreaker.findSpeed()
    icebreaker.boxesTransportation()
    icebreaker.splittingIce()

    println()
    val cargoShip = CargoShip("Грузовой", 40, 40, 20)
    cargoShip.findSpeed()
    cargoShip.boxesTransportation()
}

open class StandartShip1(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    fun findSpeed() {
        println("Корабль $name движется со скоростью: $speed")
    }

    fun boxesTransportation() {
        println("Корабль $name вмещает груз до: $capacity ящиков")
    }

}

class IceBreaker(
    name: String,
    speed: Int,
    capacity: Int,
    splittingIce: Boolean = true,
) : StandartShip1(name, speed, capacity) {

    fun splittingIce() {
        println("Может колоть лёд")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
    loadCapacity: Int,
) : StandartShip1(name, speed, capacity)