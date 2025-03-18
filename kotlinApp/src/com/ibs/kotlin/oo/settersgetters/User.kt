package com.ibs.kotlin.oo.settersgetters

class User {
    var name: String? = null
        set(value) {
            field = "Mr/Mrs $value"
        }
        get() = field?.uppercase()

}

fun main() {
    val user = User()
    user.name = "Subramanian"
    println(user.name)
}