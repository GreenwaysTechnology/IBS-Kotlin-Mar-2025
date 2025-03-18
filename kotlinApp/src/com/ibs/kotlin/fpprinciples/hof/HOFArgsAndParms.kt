package com.ibs.kotlin.fpprinciples.hof

fun adder(action: (Int, Int) -> Unit) {
    action(10, 10)
}

fun main() {
    adder(fun(a: Int, b: Int): Unit {
        var c = a + b
        println(c)
    })
}