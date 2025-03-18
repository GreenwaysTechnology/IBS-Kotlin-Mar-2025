package com.ibs.kotlin.fpprinciples.lambdas

fun delay(action: () -> Unit) {
    action.invoke()
}

fun main() {
    //passing regular function as parameter
    delay(fun() {
        println("Hello")
    })
    //passing lamabd
    var task = {
        println("Hello task")
    }
    delay(task)
    //passing lambda directly to the function
    delay({
        println("Hello how are you task")
    })
}