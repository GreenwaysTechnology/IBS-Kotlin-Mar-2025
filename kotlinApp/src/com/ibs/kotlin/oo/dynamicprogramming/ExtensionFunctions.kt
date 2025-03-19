package com.ibs.kotlin.oo.dynamicprogramming

class Util {
    fun sayHello(): String {
        return "Hello"
    }
}
//extension functions are functions which are dynmically added into object during runtime
fun Util.sayHai(): String {
    return "Hai"
}

//extension with String Object
fun String.add(name: String):String {
    //here using this you can access any property of receiver Object/type
    return this + name
}
fun Int.myadd(no1: Int): Int {
    return this.plus(no1)
}
//Extension Properties
val Util.greetings: String
    get() = "Extension property"

val String.city: String
    get() = "Coimbatore"

fun main() {
    var util = Util()
    println(util.sayHello())
    println(util.sayHai())
    var message = "Hello"
    //here name is receiver type
    println (message.add("Subramanian"))
    var number = 100
    println(number.myadd(22))
    println(util.greetings)
    println("".city)

}