package com.ibs.kotlin.basics.conditionals

fun main() {
    var x = 0
    when (x) {
        0, 10 -> println("X value is either 0 or 10")
        else -> println("No match Found")
    }
}