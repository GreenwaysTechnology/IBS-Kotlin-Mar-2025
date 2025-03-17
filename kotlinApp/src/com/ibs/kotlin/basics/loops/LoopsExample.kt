package com.ibs.kotlin.basics.loops

fun main() {
    //RANGE
    for (count in 1..10) {
        println("Count $count")
    }
    //reverse order
    for (count in 5 downTo 1) {
        println("Count $count")
    }
    //step by
    for (count in 1..10 step 2) {
        println("Count $count")
    }
    //until
    for (count in 5 until 10) println("Count Until $count")

    //while loop
    var x = 1
    while (true) {
        println("while value $x")
        x++
        if (x > 5) break
    }
}