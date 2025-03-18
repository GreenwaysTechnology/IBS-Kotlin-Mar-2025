package com.ibs.kotlin.fpprinciples.lambdas.dsl

//if you want to skip some parameters/args we can use _
fun doCompute(a: Int = 0, b: Int = 0, action: (Int, Int) -> Unit) {
    action(a, b)
}

fun main() {
    doCompute(b = 233) { _, b -> println(b) }
}