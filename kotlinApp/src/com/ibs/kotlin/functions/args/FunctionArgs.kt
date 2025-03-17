package com.ibs.kotlin.functions.args

fun sayHello(name: String = "") {
    println("Hello $name")
}

fun add(a: Int = 0, b: Int = 0) {
    var c = a + b
    println("Result is $c")
}
fun format(str: String = "str", normalizeCast: Boolean = false, upperCaseFirstLetter: Char = 'A') {
    println("Str $str noralizeCase ${normalizeCast} UpperCaseFirstLetter ${upperCaseFirstLetter}")
}
fun main() {
    sayHello("Subramasnian")
    add(10, 10)
    //without any parameter
    add()
    add(a = 10, b = 20)
    add(b = 90, a = 89)
    //named parameters
    format(str = "Hello", upperCaseFirstLetter = 'B', normalizeCast = true)
    format(normalizeCast = false);
}