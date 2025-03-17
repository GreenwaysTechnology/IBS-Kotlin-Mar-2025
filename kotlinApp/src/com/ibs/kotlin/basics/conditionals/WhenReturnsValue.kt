package com.ibs.kotlin.basics.conditionals

fun main() {
    var isLoggedIn = true
    var status =  when(isLoggedIn) {
        true -> "LoggedIn"
        false -> "LoggedOut"
    }
    println("Status $status")

}