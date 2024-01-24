class task4 {
}
/*Создать приложение, с помощью которого пользователь, введя два числа
 и символ операции, узнает результат. Символами операции могут быть:
  / — деление, * — умножение, + — сложение, - — вычитание.
  Числа могут быть вещественными. Числа и знак операции разделяются между
   собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ*/

fun main() {
    println("Введите два числа и символ операции через пробел:")
    val input = readLine()?.split(" ")

    if (input?.size == 3) {
        val number1 = input[0].toDoubleOrNull()
        val number2 = input[1].toDoubleOrNull()
        val operator = input[2]

        if (number1 != null && number2 != null) {
            val result = calculate(number1, number2, operator)
            println("Результат: $result")
        } else {
            println("Введены некорректные числа")
        }
    } else {
        println("Некорректный ввод")
    }
}

fun calculate(number1: Double, number2: Double, operator: String): Double {
    return when (operator) {
        "/" -> number1 / number2
        "*" -> number1 * number2
        "+" -> number1 + number2
        "-" -> number1 - number2
        else -> 0.0
    }
}