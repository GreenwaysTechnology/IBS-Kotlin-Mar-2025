package com.ibs.kotlin.oo.infixfuns

class Greeter {
    infix fun sayHello(name: String) {
        println("$this $name")
    }
}

infix fun Greeter.sayHai(name:String) {
    println("$this $name")
}

fun main() {
    var greeter = Greeter()
    //greeter.sayHello("Subramanian")
    greeter sayHello "Subramanian"
    greeter sayHai "hai"
}