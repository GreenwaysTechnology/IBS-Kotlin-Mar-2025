package com.ibs.kotlin.functions

//function declaration
fun sayHello() {
    println("Hello")
}

fun add(){
    println("Add Function")
    var a =10
    var b =20
    var c = a + b
    println("c $c")
}
fun main() {
   //function invocation
    sayHello()
    add()
}