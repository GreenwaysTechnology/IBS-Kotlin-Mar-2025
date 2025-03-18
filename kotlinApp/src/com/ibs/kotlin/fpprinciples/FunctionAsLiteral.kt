package com.ibs.kotlin.fpprinciples

//declare variable with expclit type
var hello: String = "hello"
//declare variable with implicit type ; type inference
var firstName ="Subramanian"

//function declaration with explcit type
var sayHello: () -> Unit = fun() {
    println("Hello fun")
}
//function declaration with implcit type : type inference
var sayHai = fun() {
    println("hai")
}


fun main() {
    println(hello)
    sayHello()
    sayHai()
}