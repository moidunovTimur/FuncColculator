package com.example.funccolculator

import java.util.*



fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Введите два числа: ")

    val first = reader.nextDouble()
    val second = reader.nextDouble()

    print("Введите оператора (+, -, *, /,%): ")
    val operator = reader.next()[0]

    val result: Double

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        '%' -> result = first % second

        else -> {
            System.out.printf("\n" +
                    "Ошибка! оператор не правильный")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)
}
