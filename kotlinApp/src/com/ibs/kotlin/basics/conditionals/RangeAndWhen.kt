package com.ibs.kotlin.basics.conditionals


fun main() {
    var input= 5666
    when (input) {
       in 1..107-> println("Input Range is 1 to 100")
       !in 1..100 -> println("Input Range doest not match ")
    }
}