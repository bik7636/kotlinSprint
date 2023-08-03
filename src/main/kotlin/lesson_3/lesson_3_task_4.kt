package lesson_3

fun main() {
    var whereFrom= "E2"
    var where = "E4"
    var strokeNumber = 1

    var move = "$whereFrom $where $strokeNumber"
    println(move)

    whereFrom= "D2"
    where = "D3"
    strokeNumber = 1
    move = "$whereFrom $where $strokeNumber"
    println(move)
}