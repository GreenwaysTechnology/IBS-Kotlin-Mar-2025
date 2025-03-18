package com.ibs.kotlin.fpprinciples.lambdas.dsl

fun delay(action: () -> Unit) {
    action()
}

fun repositories(action: () -> Unit) {
    action()
}

fun mavenCentral() {
    println("downloading jar dependencies")
}

fun main() {
    var task = {
        println("my task")
    }
    //normal syntax
    delay(task)
    //dsl syntax
    delay { println("My task again") }

    repositories {
        mavenCentral()
    }

}