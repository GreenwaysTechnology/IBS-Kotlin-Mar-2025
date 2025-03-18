package com.ibs.kotlin.fpprinciples
//
//var accept: (String?) -> String? = fun(message: String?): String? {
//      return  message
//}
//var accept = fun(message: String?): String? {
//    return  message
//}
//var accept: ((String) -> String)? = fun(message: String): String {
//    return "Hello $message"
//}
var display: (String?) -> String? = fun(message: String?): String? {
    return "Hello $message"
}

fun main() {
 // println(accept("hello"))
//    println(accept?.invoke("ram"))
    println(display?.invoke(null))

}