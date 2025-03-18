package com.ibs.kotlin.fpprinciples

//with type
//var add: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
//    return a + b
//}
//without type: type inference
//var add= fun(a: Int, b: Int): Int {
//    return a + b
//}
//single expression function
var add = fun(a: Int, b: Int) = a + b

fun main() {
    println(add(10, 10))
}