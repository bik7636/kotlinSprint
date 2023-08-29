package lesson_11

fun main() {
    val room = Room(
        1, "kotlin.jpg", "kotlin lovers",
        listOf(
            User(1, "avatar1", "someUser1", Status(false, true, true))
        )
    )

    val room2 = Room(
        2, "cat.jpg", "cat lovers",
        listOf(User(2, "avatar2", "someUser2", Status(true, false, false)))
    )

    val rooms = listOf(room, room2)
}

class Room(
    val id: Int,
    val cover: String,
    val title: String,
    val users: List<User>
)

class User(
    val id: Int,
    val avatar: String,
    val nikname: String,
    val status: Status
)

class Status(
    val isTalking: Boolean,
    val isMicrophoneOff: Boolean,
    val isSilenced: Boolean
)