package com.ibs.kotlin.functions.returns

//exclit Unit
fun doStuff(): Unit {
    println("Hello")
    return
}
//implicit Unit
fun doSomething() {
    println("Unit")
    return
}

fun main() {
    doStuff()
    doSomething()
}