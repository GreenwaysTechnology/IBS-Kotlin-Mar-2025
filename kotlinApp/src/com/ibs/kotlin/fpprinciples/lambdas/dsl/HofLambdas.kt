package com.ibs.kotlin.fpprinciples.lambdas.dsl

fun compute(no: Int = 0, action: () -> Unit) {
    println("No $no")
    action()
}

fun main() {
    compute(10, { println("compute") })
    compute {
        println("hello")
    }
}