package lesson_20

fun main() {
    val itemList = listOf("el1", "el2", "el3", "el4", "el5", "el6")
    val lambdaList = itemList.mapIndexed { index, element ->
        if (index % 2 == 1) {
            println("Нажат элемент: $element")
        }
    }
    lambdaList.forEach { it }
}