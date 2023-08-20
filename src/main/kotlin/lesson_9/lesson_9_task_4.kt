
fun main() {
    println("Введите 5 ингридиентов для блюда через запятую: ")
    val userIngridient = readln()

    val ingridient = userIngridient.split(",").sorted()
    println(ingridient)
}