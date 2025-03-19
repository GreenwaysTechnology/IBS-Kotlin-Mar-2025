package com.ibs.kotlin.oo.corepackages

class Sample {
    override fun toString(): String {
        return "Your class"
    }

    override fun hashCode(): Int {
        return 24122424
    }

}

class Square(val side: Int) {

    override fun equals(other: Any?): Boolean {
        //is eq to instanceof
        if(other is Square){
            return other.side === side
        }
        return  false
    }
}

fun main() {
    var sample = Sample()
    println(sample.toString())
    println(sample.hashCode())
    var square1 = Square(10)
    var square2 = Square(45)
    var isEqual = square1.equals(square2)
    println(isEqual)
}