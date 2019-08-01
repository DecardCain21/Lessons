package com.example.satana.temp

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter two numbers: ")
    var num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val kivun: Int

    if (num1 > num2) {
        kivun = -1

    } else {
        kivun = 1
    }

    while (num1 != num2 - kivun) {
        num1 = increaseNumber(num1, kivun)
    }
    scanner.close()
}

private fun increaseNumber(num1: Int, kivun: Int): Int {
    var num11 = num1
    num11 = num11 + kivun
    println(num11)
    return num11
}