package com.ibs.kotlin.nulls

fun sayHello(name: String?="") {
    println("Hello ${name?.toString() ?: ""} and its length is ${name?.length ?: 0}")
}

fun main() {
    sayHello("Subramanian")
    sayHello(null)
}