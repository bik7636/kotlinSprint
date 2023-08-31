package lesson_13

fun main() {
    val contactBook = mutableListOf<TelephoneDirectory3>()
    val contact = TelephoneDirectory3("Человек-паук", 77778889956, "Мстители")
    val contact2 = TelephoneDirectory3("Человек-муравей", 99998881322, null)
    val contact3 = TelephoneDirectory3("Человек-человек", 23128889966)

    contactBook.add(contact)
    contactBook.add(contact2)
    contactBook.add(contact3)

    fun printContactInfo(contact: TelephoneDirectory3) {
        println("Имя: ${contact.name}")
        println("Номер телефона: ${contact.phoneNumber}")
        println("Компания: ${contact.company ?: "[не указано]"}")
    }

    for (contact in contactBook) {
        printContactInfo(contact)
        println()
    }

}

class TelephoneDirectory3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)