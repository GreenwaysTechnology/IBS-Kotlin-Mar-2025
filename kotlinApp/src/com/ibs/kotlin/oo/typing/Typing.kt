package com.ibs.kotlin.oo.typing

open class Animal {
    open fun eat() {
        println("eat")
    }
}

//child class
class Dog : Animal() {
    override fun eat() {
        println("dog eats")
    }
    fun bark() {
        println("dog is barking")
    }
}

fun main() {
    //program to sub type
    var dog: Dog = Dog()
    dog.eat()
    dog.bark()
    //program to super type
    var mydog: Animal = Dog()
    mydog.eat()
    var tmpDog = mydog as Dog
    mydog.bark()
    tmpDog.bark()
}