package lesson_14

fun main() {
    val standartShip = StandartShip1("Стандарт", 60, 5)
    standartShip.getSpeed()
    standartShip.getCapacity()
    println()

    val icebreaker = IceBreaker("Ледокол", 20, 2)
    icebreaker.getSpeed()
    icebreaker.getCapacity()
    icebreaker.breakIce()

    println()
    val cargoShip = CargoShip("Грузовой", 40, 40, 20)
    cargoShip.getSpeed()
    cargoShip.getCapacity()
}

open class StandartShip1(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    fun getSpeed() {
        println("Корабль $name движется со скоростью: $speed")
    }

    fun getCapacity() {
        println("Корабль $name вмещает груз до: $capacity ящиков")
    }

}

class IceBreaker(
    name: String,
    speed: Int,
    capacity: Int,
    splittingIce: Boolean = true,
) : StandartShip1(name, speed, capacity) {

    fun breakIce() {
        println("Корабль $name активировал уничтожение льда на своём пути")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
    loadCapacity: Int,
) : StandartShip1(name, speed, capacity)