package com.ibs.kotlin.basics.conditionals

fun main() {
    var num = 1;
    var isEvenOrOdd = when {
        num % 2 == 0 -> "Even"
        num % 2 != 0 -> "Odd"
        else -> "No Match Found"
    }
    println("$num is $isEvenOrOdd")
}