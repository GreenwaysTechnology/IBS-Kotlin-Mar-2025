package com.ibs.kotlin.functions.varargs

fun logger(vararg args: String) {
    for (arg in args) println(arg)
}

fun main() {
    logger("Employee.kt", "Warning", "Save Method is called")
    logger("Employee.kt", "Error", "remove Method is called", "501")
}