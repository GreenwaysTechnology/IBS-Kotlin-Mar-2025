package com.ibs.kotlin.operatoroverloading

class Person {
    var skills: String? = null
    fun show() = skills
}

infix operator fun Person.plus(person: Person): Person {
    var newPerson = Person()
    newPerson.skills = this.skills + person.skills
    return newPerson
}

fun main() {
    var person1 = Person()
    person1.skills = "Kotlin"
    var person2 = Person()
    person2.skills = "Spring Boot"

    person1.plus(person2).apply {
        println(show())
    }

}