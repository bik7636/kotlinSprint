package lesson_2
fun main() {
    val employee = 50
    val intern = 30
    val salaryEmployee = 30000
    val salaryIntern = 20000

    val employeePayouts = employee * salaryEmployee
    val generalExpenses = (intern * salaryIntern) + employeePayouts
    val averageSalary = generalExpenses / 80

    println(employeePayouts)
    println(generalExpenses)
    println(averageSalary)

}