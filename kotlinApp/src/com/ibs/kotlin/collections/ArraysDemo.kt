package com.ibs.kotlin.collections

fun main() {
    var list = intArrayOf(1,2,3,5)
    println(list.get(0))
    list.forEach { println(it) }
    val courses = arrayOf("Kotlin", "Java", "Scala", "Groovy")
    courses.iterator().forEach { println(it) }
}