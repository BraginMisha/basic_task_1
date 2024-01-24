class tas1 {
}
/*Создать приложение, которое подсчитывает количество подряд идущих
 одинаковых символов во введенной строке. На вход подается, например,
 строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4. */

fun main() {
    print("Введите строку:")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        var result = ""
        var count = 1

        for (i in 1 until input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                if (count > 1) {
                    result += input[i - 1] + count.toString()
                } else {
                    result += input[i - 1]
                }
                count = 1
            }
        }

        // последний символ
        if (count > 1) {
            result += input[input.length - 1] + count.toString()
        } else {
            result += input[input.length - 1]
        }

        println("Результат: $result")
    } else {
        println("Некорректный ввод")
    }
}