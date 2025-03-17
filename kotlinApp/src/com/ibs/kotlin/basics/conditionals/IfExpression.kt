package com.ibs.kotlin.basics.conditionals

fun main() {
    var a = 1000
    var b = 2000
    var max = a
    //traditional style: java style
    if (a < b) {
        max = b
    }
    println("Max $max")
    //Kotlin expression style
    if (a < b) max = b
    println("Max $max")
    //if..else : java style
    if (a > b) {
        max = a
    } else {
        max = b
    }
    //if..else kotlin style
    max = if (a > b) a else b

    var isValid = false
    var response = if (isValid) {
        //any code to be executed
        println("More code")
        var firstName = "Subramanian"
        //return value
        "Hello $firstName"
    } else {
        println("More code")
        var firstName = "Murugan"
        //return value
        "How are you Mr.$firstName"
    }
    println(response)


}
