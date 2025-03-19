package com.ibs.kotlin.oo.corepackages

sealed class MyResult {
    //child classes : unlike regular inheritance, sealed class encapuslate child classes.
    data class Success(val resolve: String) : MyResult()
    data class Failure(val reject: String) : MyResult()
    class Loader : MyResult()
}

fun getSucess():MyResult {
    return  MyResult.Success("Data is available")
}

fun getFailure(): MyResult {
    return MyResult.Failure("Something is went wrong")
}
//all in one
fun fetch(): MyResult {
    var status = 200
    if (status === 200)
        return MyResult.Success("Response found")
    return MyResult.Failure("failed")
}

fun main() {
 var response = getSucess()
    when(response){
        is MyResult.Success -> {
            println(response.resolve)
        }
        is MyResult.Failure -> {
            println(response.reject)
        }
        else -> {
            println("Loading")
        }
    }
    var failure = getFailure()
    when (failure) {
        is MyResult.Success -> {
            println(failure.resolve)
        }
        is MyResult.Failure -> {
            println(failure.reject)
        }
        else -> {
            println("Loading")
        }
    }
    var res = fetch()
    when (res) {
        is MyResult.Success -> {
            println(res.resolve)
        }
        is MyResult.Failure -> {
            println(res.reject)
        }
        else -> {
            println("Loading")
        }
    }
}