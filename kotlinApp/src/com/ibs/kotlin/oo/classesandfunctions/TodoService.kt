package com.ibs.kotlin.oo.classesandfunctions

class TodoService {
    //functions
    fun findAll(): String {
        return "FindAll"
    }

    fun remove(id: Int) = "$id Removed"
    var update = {
        "updated"
    }
}
fun main() {
    var todoService = TodoService()
    println(todoService.findAll())
    println(todoService.update())
    println(todoService.remove(333))
}