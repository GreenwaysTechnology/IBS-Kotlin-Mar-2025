package com.ibs.kotlin.basics.conditionals

fun main() {
    var x = 1
    when (x) {
        1 -> println("X is One")
        2 -> println("X is Two")
        else -> println("No match Found")
    }
}