package com.ibs.kotlin.generics

class Box<T>(t:T) {
     var value = t
}

fun main() {
    var box1:Box<Int> = Box(10)
    //box1.value =" test"
}