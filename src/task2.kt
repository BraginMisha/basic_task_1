class task2 {
}

/*Создать приложение, которое подсчитывает количество различных
 символов во введенной строке. Символы в ответе расположить в алфавитном порядке.
 Например, дана строка AASADDSS. На выходе получаем:
A - 3
D - 2
S - 3*/

fun count(input: String) {
    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        if (charCount.containsKey(char)) {
            charCount[char] = charCount[char]!! + 1
        } else {
            charCount[char] = 1
        }
    }

    val sortedCharCount = charCount.toSortedMap()

    for ((key, value) in sortedCharCount) {
        println("$key - $value")
    }
}

fun main() {
    print("Введите строку: ")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        count(input)
    } else {
        println("Некорректный ввод")
    }
}