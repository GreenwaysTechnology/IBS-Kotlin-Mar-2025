package com.ibs.kotlin.fpprinciples.hof

fun login(userName: String = "foo", password: String = "bar", resolve: (String) -> Unit, reject: (String) -> Unit) {
    if (userName == "admin" && password == "admin")
        resolve("Login success")
    else
        reject("Login failed")
}

fun main() {
    login(
        userName = "admin",
        password = "admin",
        resolve = fun(status) { println(status) },
        reject = fun(err) { println(err) }
    )

    login(
        resolve = fun(status) { println(status) },
        password = "admin",
        reject = fun(err) { println(err) },
        userName = "admin"
    )


}