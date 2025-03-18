package com.ibs.kotlin.fpprinciples.hof


fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    //How to pass values to the function?
    //hard coded value
    println(add(10, 10))
    //via variables
    var x = 10
    var y = 20
    println(add(x,y))
}