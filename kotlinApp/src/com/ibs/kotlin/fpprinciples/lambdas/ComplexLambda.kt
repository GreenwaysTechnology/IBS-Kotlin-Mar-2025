package com.ibs.kotlin.fpprinciples.lambdas

var login = { userName: String, password: String ->
    if (userName == "admin" && password == "admin")
        "Login Success"
    else
        "Login Failed"
}

fun main() {
    println(login("admin", "admin"))
}