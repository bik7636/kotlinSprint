package lesson_15

fun main() {
    val admin = Admin("Admin")
    val user = User("John Wick")

    user.postMessage()
    user.readForum()
    println()

    admin.readForum()
    admin.postMessage()
    admin.deleteMessage(user)
    admin.deleteUser(user)
}

abstract class BaseUser(val username: String) {
    abstract fun readForum()

    abstract fun postMessage()
}

class Admin(username: String) : BaseUser(username) {

    override fun readForum() {
        println("$username читает форум")
    }

    override fun postMessage() {
        println("$username отправил сообщение")
    }

    fun deleteMessage(user: BaseUser) {
        println("Сообщение пользователя ${user.username} удалено")
    }

    fun deleteUser(user: BaseUser) {
        println("Пользователь ${user.username} был удалён")
    }
}

class User(username: String) : BaseUser(username) {
    override fun readForum() {
        println("$username читает форум")
    }

    override fun postMessage() {
        println("$username отправил сообщение")
    }

}