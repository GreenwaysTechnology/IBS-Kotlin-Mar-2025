package com.ibs.kotlin.fpprinciples.hof

//hof : function as parameter to another function
fun sayGreet(action: () -> Unit) {
    //invoke that function
    action()
    action.invoke()
}

fun main() {
//    var myFun = fun() {
//        println("Hello")
//    }
    var myFun: () -> Unit = fun() {
        println("Hello")
    }
    sayGreet(myFun)
    //passing function directly
    sayGreet(fun() {
        println("Hello , How are you")
    })
}