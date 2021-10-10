package com.example.myapp

fun main(args : Array<String>){
    checkNumber(8.0)
}

/**Check the type of a character**/
private fun checkNumber(number: Number) = when(number){
    is Integer-> println("It is an integer")
    is Double-> println("It is a double")
    is Float-> println("It is a float")
    is Long-> println("It is a long")
    else-> println("Invalid")

}