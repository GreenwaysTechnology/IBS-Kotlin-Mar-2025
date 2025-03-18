package com.ibs.kotlin.nulls

fun main() {
    var firstName:String? = null
    //access property on null value/object
    //println(firstName.length)
    //Ways to handle null
    //Way 1: Handling null using java style

//    firstName="Subramanian"
    if (firstName != null) {
        println(firstName.length)
    }
    //Way 2: Kotlin style "Using safe navigation operator
    println(firstName?.length)

    //Way 3: Kotlin style "Using Elvis Operator" : if there is null,if you want some default
    // instead of "null" string.
    var length = firstName?.length ?: 0
    println("Length of String is $length")

    //assertion operator which throws RuntimeException
    println("${firstName!!.length}")
}