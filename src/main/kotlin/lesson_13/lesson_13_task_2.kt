package lesson_13

fun main() {
    val contact = TelephoneDirectory2("Александр", 77778889966, null)
    contact.displayContact()
}

class TelephoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: String?
) {
    fun displayContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "[не указано]"}")
    }
}