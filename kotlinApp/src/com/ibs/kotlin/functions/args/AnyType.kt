package com.ibs.kotlin.functions.args

fun accept(a: Any) {
    println(a)
}

fun main() {
    accept("Hello")
    accept(100)
    accept(39.34)
    accept(true)
}