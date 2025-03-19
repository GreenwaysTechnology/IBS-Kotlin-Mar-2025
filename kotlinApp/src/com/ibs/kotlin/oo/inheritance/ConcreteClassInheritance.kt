package com.ibs.kotlin.oo.inheritance

//base class : by default all classes are closed for inheritance
//what if i want to open for inheritance

open class Animal {
    init {
        println("Animal constructor is running")
    }
}

//child class
class Dog : Animal() {
    init {
        println("Dog constructor is running")
    }
}

fun main() {
    //var dog: Dog = Dog()
    var dog: Animal = Dog()
}