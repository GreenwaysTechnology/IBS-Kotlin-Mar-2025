package com.ibs.kotlin.scopefunctions

data class User(var name: String = "", var location: String = "", var points: Int = 0) {
    //biz logic
    fun updateLocation(newLocation: String) {
        location = newLocation
    }

    fun incrementPoints() {
        points++
    }
}

fun getObjectWithoutScope() {
    var user = User(name = "Subramanian", location = "Coimbatore", points = 10)
    //access properties
    println("Name ${user.name}")
    println("Location ${user.location}")
    println("Points ${user.points}")

    //update location and points
    user.updateLocation("Chennai")
    user.incrementPoints()
    println("Location ${user.location}")
    println("Points ${user.points}")
}

fun getObjectWithLet() {
    User(name = "Subramanian", location = "Coimbatore", points = 10).let {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
        it
    }.let {
        it.updateLocation("New Delhi")
        it
    }.let {
        println("Location ${it.location}")
    }
}

fun getObjectUsingRun() {
    User(name = "Subramanian", location = "Coimbatore", points = 10).run {
        println("Name ${this.name}")
        println("Location ${this.location}")
        println("Points ${this.points}")
        this
    }.run {
        updateLocation("New Delhi")
        this
    }.run {
        incrementPoints()
        this
    }.run {
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
    }
}

fun getObjectUsingWith() {

    with(User(name = "Subramanian", location = "Coimbatore", points = 10)) {
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
        this
    }.run {
        updateLocation("New Delhi")
        this
    }
}

fun main() {
    //getObjectWithoutScope();
    //getObjectWithLet()
    //getObjectUsingRun()
    //getObjectUsingWith()
    User(name = "Subramanian", location = "Coimbatore", points = 10).apply {
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
    }.apply {
        updateLocation("New Delhi")
    }.apply {
        println("Location ${location}")
    }
    User(name = "Subramanian", location = "Coimbatore", points = 10).also {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
        //dont need to return it keyword
    }.also {
        it.updateLocation("Chennai")
    }.also {
        it.incrementPoints()
    }.also {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
    }

    //
    //mix:
    with("subramanian".run {
        uppercase()
        trim()
        this
    }) {
        println(this)
        println(length)
    }


}