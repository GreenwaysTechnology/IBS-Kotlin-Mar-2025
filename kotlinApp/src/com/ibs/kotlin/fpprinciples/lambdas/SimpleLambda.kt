package com.ibs.kotlin.fpprinciples.lambdas

//formal function
fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}

//single function expression
fun addExpression(a: Int = 0, b: Int = 0) = a + b

//function as literal : default values can't be initialized in the function literal
var addFunLiteral = fun(a: Int, b: Int): Int {
    return a + b
}

//lambdas
var addLambda = { a: Int, b: Int ->
    //body of the function
    println("lambda example")
    // return  a +b invalid
    a + b //last line of the function to be treated as return value and also type is infered
}

fun main() {
    println(add())
    println(addExpression())
    println(addFunLiteral(33, 333))
    println(addLambda(1, 2))
}