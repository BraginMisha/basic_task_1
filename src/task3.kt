class task3 {
}
/*Создать приложение, которое преобразует введенное пользователем
 натуральное число из 10-ичной системы в двоичную.*/

fun main() {
    print("Введите число в 10-й сс: ")
    val input = readLine()?.toInt()

    if (input != null) {
        val binaryNumber = decimalToBinary(input)
        println("Число в 2-й сс: $binaryNumber")
    } else {
        println("Некорректный ввод")
    }
}
fun decimalToBinary(decimal: Int): String {
    var number = decimal
    var binary = ""

    while (number > 0) {
        val digit = number % 2
        binary = digit.toString() + binary
        number /= 2
    }
    return binary
}