package com.ibs.kotlin.basics.types

fun main() {
    var firstName:String = "Subramanian"
    var lastName = "Murugan"
    //java style ; not recommened
    println("Name " + firstName + lastName)
    //kotlin style: recommended
    println("Name $firstName ${lastName}")

}