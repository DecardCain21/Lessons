package com.example.satana.Exercise

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var number: Int
    var reversedNumber = 0

    print("Enter number: ")
    number = scanner.nextInt()
    while (number > 9) {
        reversedNumber += number % 10
        number /= 10
        reversedNumber *= 10
    }
    reversedNumber += number
    print("reversed number is  $reversedNumber")
}