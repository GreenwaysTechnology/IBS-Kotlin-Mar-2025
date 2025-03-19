package com.ibs.kotlin.oo.corepackages

data class User(val name: String, val age: Int)

fun main() {
    var user = User("Subramanian", 18)
    println(user.toString())
    println(user.hashCode())
    var userTmp = User("Subramanian", 18)
    println(user.equals(userTmp))
    //clone api
    val newUser =user.copy(age=43)
    println(newUser)
}