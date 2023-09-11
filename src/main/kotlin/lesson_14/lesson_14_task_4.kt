package lesson_14

fun main() {
    val sun = CelestialBody("Солнце", 198900)
    sun.printDescription()

    val earth = Planet("Земля", 597, 1)
    earth.printDescription()
    earth.planetInfo()

    val moon = Satellite("Луна", 73, "Земля")
    moon.printDescription()
    moon.satelliteInfo()

}

open class CelestialBody(val name: String, val mass: Int) {
    fun printDescription() {
        println("Планета: $name, Масса: $mass")
    }
}

class Planet(name: String, mass: Int, val numOfMoons: Int) : CelestialBody(name, mass) {
    fun planetInfo() {
        println("Планета: $name, Масса: $mass, Количество лун: $numOfMoons")
    }
}

class Satellite(name: String, mass: Int, val orbitingPlanet: String) : CelestialBody(name, mass) {
    fun satelliteInfo() {
        println("Планета: $name, Масса: $mass, Вращающаяся планета: $orbitingPlanet")
    }
}