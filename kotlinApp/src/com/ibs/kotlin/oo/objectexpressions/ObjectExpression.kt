package com.ibs.kotlin.oo.objectexpressions

class Employee {
    //static variables /object expression
    var person = object {
        var id = 1
        var firstName = "Subramanian"
    }
}

object Message {
    var Info = "info"
}

fun main() {
    var emp = Employee()
    println(emp)
    println(Message.Info)
    var Person = object {
        var id = 1
        var firstName = "Subramnaian"
    }
    println(Person.id)
    println(Person.firstName)

}