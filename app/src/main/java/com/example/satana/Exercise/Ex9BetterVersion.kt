package com.example.satana.Exercise

import java.util.*

fun main() {
    var sumNumbers = 0
    var countNumbers = 0
    val scanner = Scanner(System.`in`)
    try {
        while (true) {
            System.out.print("EnterNum: ")
            val num = scanner.nextInt()
            sumNumbers += num
            countNumbers++
        }
    } catch (e: Exception) {
        System.out.println("finish")
    } finally {
        System.out.println("avg: $sumNumbers/$countNumbers = ${sumNumbers / countNumbers}")
        scanner.close()
    }

}