package com.ibs.kotlin.oo

//class Customer {
//    //instance variables
//    var id: Int? = null
//    var firstName: String? = null
//    var lastName: String? = null
//    var status: Boolean = false
//}


class Customer {
    //instance variables
    var id: Int? = 0
    var firstName: String? = "Subramanian"
    var lastName: String? = "Murugan"
    var status: Boolean? = true

}

fun main() {
    //instance creation : no new keyword to create instance
    //customer is reference variable,Customer() is constructor call
    val customer = Customer()
    customer.id = 1
    customer.firstName = "Geetha"
    customer.lastName = "Subramanian"
    customer.status = true
    println("Id ${customer.id}")
    println("Name ${customer.firstName} ${customer.lastName}")
    println("Status ${customer.status}")
}