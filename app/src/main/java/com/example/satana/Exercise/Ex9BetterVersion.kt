package com.example.satana.Exercise

import java.util.*

fun main() {
    var sumNumbers = 0
    var countNumbers = 0
    val scanner = Scanner(System.`in`)
    try {
        while (true) {
            print("EnterNum: 1")
            val num = scanner.nextInt()
            sumNumbers += num
            countNumbers++
        }
    } catch (e: Exception) {
        println("finish")
    } finally {
        println("avg: $sumNumbers/$countNumbers = ${sumNumbers / countNumbers}")
        scanner.close()
    }

}