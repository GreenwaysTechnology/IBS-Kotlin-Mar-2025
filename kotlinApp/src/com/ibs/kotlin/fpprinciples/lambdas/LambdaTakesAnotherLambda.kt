package com.ibs.kotlin.fpprinciples.lambdas

var async = { action: () -> Unit ->
    action()
}

fun main() {
    var task = {
        println("task-lambda")
    }
    async(task)
    async({
        println("lambda task 1")
    })
    async(fun() {
        println("delay")
    })

}