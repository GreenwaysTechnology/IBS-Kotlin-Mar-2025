package com.ibs.kotlin.functions.returns

fun sayHello(name: String = "Ram"): String {
    return "Hello $name"
}

fun multiply(a: Int = 0, b: Int = 0): Int {
    return a * b
}

fun main() {
    var res = sayHello("Subramanian")
    println(res)
    println(multiply(b = 90, a = 80))
}