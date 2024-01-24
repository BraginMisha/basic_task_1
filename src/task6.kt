class task6 {
}
/*Создать приложение, в котором пользователь вводит две различных цифры.
 На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
 Результат выводится в консоль. При невозможности создать нечетное число выводится
 сообщение – «Создать нечетное число невозможно». Каждое число вводится на отдельной строке*/

fun main() {
    print("Введите первое число: ")
    val number1 = readLine()?.toIntOrNull()

    print("Введите второе число: ")
    val number2 = readLine()?.toIntOrNull()

    if (number1 != null && number2 != null) {
        val sum = number1 + number2
        val diff = number1 - number2
        val diff2 = number2 - number1
        val multi = number1 * number2
        val div = number1 / number2
        val div2 = number2 / number1
        var prov = 0

        if (sum % 2 != 0) {
            println("Результат сложения: $sum")
            prov++
        }

        if (diff % 2 != 0) {
            println("Результат вычитания: $diff")
            prov++
        }

        if (diff2 % 2 != 0) {
            println("Результат вычитания: $diff")
            prov++
        }

        if (multi % 2 != 0) {
            println("Результат умножения: $multi")
            prov++
        }

        if (div % 2 != 0) {
            println("Результат деления: $div")
            prov++
        }

        if (div2 % 2 != 0) {
            println("Результат деления: $div")
            prov++
        }

        if (prov == 0) {
            println("Создать нечетное число невозможно")
        }

    } else {
        println("Введены некорректные числа")
    }
}