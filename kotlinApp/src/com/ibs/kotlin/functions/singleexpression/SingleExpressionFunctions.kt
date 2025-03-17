package com.ibs.kotlin.functions.singleexpression

//normal syntax
//fun sum(a: Int = 0, b: Int = 0): Int {
//    return a * b
//}
//single Expression Function
//fun sum(a: Int = 0, b: Int = 0): Int = a * b
//Omit the return type
fun sum(a: Int = 0, b: Int = 0) = a * b
fun display(name: String = "") = "Hello $name"

fun main() {
    println(sum(10, 10))
    println(display("Subramanian"))
}