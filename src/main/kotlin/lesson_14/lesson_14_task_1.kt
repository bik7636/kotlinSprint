package lesson_14

fun main() {
    val standartShip = StandartShip("Стандарт", 60, 5)
    standartShip.getSpeed()
    standartShip.getCapacity()
}

class StandartShip(val name: String, val speed: Int, val capacity: Int) {
    fun getSpeed() {
        println("Корабль $name движется со скоростью: $speed")
        println()
    }

    fun getCapacity() {
        println("Корабль $name вмещает груз до: $capacity ящиков")
        println()
    }
}