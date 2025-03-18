package com.ibs.kotlin.fpprinciples.lambdas

//var sayMyName = { name:String ->
//    "Hello ${name}"
//}
var sayMyName: (String) -> String = {
    println("Hello")
    print("how are you")
    "Hello ${it}"
}
var doubleIt: (Int) -> Int = { it * 2 }


fun main() {
    println(sayMyName("Subramanian"))
    println(doubleIt(10))
}