package lesson_3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age = 22

    println("$surname $name $patronymic , ${age - 2}")

    surname = "Сидорова"
    println("$surname $name $patronymic , $age")
}
