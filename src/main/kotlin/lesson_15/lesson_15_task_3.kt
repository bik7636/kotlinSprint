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

abstract class UsersForum(val username: String) {
    abstract fun readForum()

    abstract fun postMessage()
}

class Admin(username: String) : UsersForum(username) {

    override fun readForum() {
        println("$username читает форум")
    }

    override fun postMessage() {
        println("$username отправил сообщение")
    }

    fun deleteMessage(user: UsersForum) {
        println("Сообщение пользователя ${user.username} удалено")
    }

    fun deleteUser(user: UsersForum) {
        println("Пользователь ${user.username} был удалён")
    }
}

class User(username: String) : UsersForum(username) {
    override fun readForum() {
        println("$username читает форум")
    }

    override fun postMessage() {
        println("$username отправил сообщение")
    }

}