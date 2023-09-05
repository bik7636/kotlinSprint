package lesson_15

fun main() {
    val carp = Carp("Карп")
    carp.swim()
    println()

    val seagull = Seagull("Чайка")
    seagull.swim()
    seagull.fly()
    println()

    val duck = Duck("Утка")
    duck.swim()
    duck.fly()
}

class Carp(val name: String) : suitableForSwimming {
    override fun swim() {
        println("$name плавает")
    }

}

class Seagull(val name: String) : suitableForFlying, suitableForSwimming {
    override fun swim() {
        println("$name плавает")
    }

    override fun fly() {
        println("$name летит")
    }

}

class Duck(val name: String) : suitableForFlying, suitableForSwimming {
    override fun swim() {
        println("$name плавает")
    }

    override fun fly() {
        println("$name летит")
    }

}

interface suitableForSwimming {
    fun swim()
}

interface suitableForFlying {
    fun fly()
}