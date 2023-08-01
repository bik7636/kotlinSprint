package lesson_1

fun main() {
    val numberOfOrders: Int = 75
    var thankYouMessage: String = "Большое спасибо за то что выбрали нас!"
    var staff: Int = 2000

    println("Количество заказов: $numberOfOrders \n$thankYouMessage")
    // println("Количество сотрудников: $staff")
    println("Количество сотрудников: ${staff - 1}")
}