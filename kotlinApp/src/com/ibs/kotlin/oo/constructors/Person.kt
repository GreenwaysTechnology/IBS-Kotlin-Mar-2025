package com.ibs.kotlin.oo.constructors

//class Person constructor(var firstName: String = "", var lastName: String = "", var age: Int = 18) {
//}
//class Person(var firstName: String = "", var lastName: String = "", var age: Int = 18) {
//
//}
class Person(var firstName: String = "", var lastName: String = "", var age: Int = 18)


fun main() {
    var person = Person(age = 45, firstName = "Subramanian", lastName = "Murugan")
    println("Name ${person.firstName} ${person.lastName}")
    println("Age ${person.age}")

}