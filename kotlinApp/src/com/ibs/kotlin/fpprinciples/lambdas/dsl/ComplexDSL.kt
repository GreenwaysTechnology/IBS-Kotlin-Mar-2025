package com.ibs.kotlin.fpprinciples.lambdas.dsl

import kotlin.concurrent.thread


fun computeNo(no: Int = 0, action: () -> Unit) {
    println("No $no")
    action()
}

fun filterBy(
    order: String = "asc",
    name: String = "name",
    no: Int = 0,
    action: () -> Unit
) {
    println("Order $order Name $name No $no")
    action()
}

fun main() {
    computeNo(10, { println("compute Nos") })
    computeNo(10) { println("Compute Nos again") }
    filterBy { println("Filter callback") }

    filterBy(name = "Subramanian", order = "asy", no = 1) {
        println("Filter callback with values")
    }
    thread {
        Thread.sleep(1000)
        println(Thread.currentThread().name)
    }
    thread(name = "MyThread", priority = 2, start = true) {
        println(Thread.currentThread().name)
    }


}