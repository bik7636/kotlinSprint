package lesson_14

fun main() {
    val post = Message("Привет, это мой первый пост!", "user1")
    post.publishPost()
    val comment = Comment("Отличный пост!", "user2", post)
    comment.publishComment()
}

open class Message(val text: String, val author: String) {

    fun publishPost() {
        println("Пост от: $author\nСообщение: $text")
    }

}

class Comment(text: String, author: String, val post: Message) : Message(text, author) {

    fun publishComment() {
        println("Комментарий от $author: $text")
        println("Комментарий оставлен к посту [${post.author}: ${post.text}]")
    }
}