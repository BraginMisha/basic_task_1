
/*Создать приложение, с помощью которого пользователь, введя целое
 число n и основание степени x узнает, существует ли целочисленный
 показатель степени y для которого выполняется равенство xy = n.
 В случае, если показатель существует – вычислить его и вывести.
 В противном случае вывести текст – «Целочисленный показатель не существует».*/

import kotlin.math.pow

fun main() {
    print("Введите целое число n:")
    val n = readln().toInt()
    print("Введите основание степени x:")
    val x = readln().toDouble()

    val y = count(n, x)

    if (y != null) {
        val result = x.toDouble().pow(y.toDouble())
        println("$x в степени $y равно $result")
    } else {
        println("Целочисленный показатель не существует")
    }
}

fun count(n: Int, x: Double): Int? {
    var y = 0
    while (x.toDouble().pow(y.toDouble()) <= n) {
        if (x.toDouble().pow(y.toDouble()) == n.toDouble()) {
            return y
        }
        y++
    }
    return null
}