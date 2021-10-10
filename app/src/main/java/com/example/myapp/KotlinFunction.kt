package com.example.myapp

fun main(args : Array<String>){

    // Asking user to enter values
    println("Enter your name:")
    var name = readLine()
    println("Enter your age:")
    var age: Int = Integer.valueOf(readLine())
    println("Your name is ${name} and your age is ${age}")
    println()

    println("Enter two values:")
    var value1: Int = Integer.valueOf(readLine())
    var value2: Int = Integer.valueOf(readLine())
    var ans1 = minMax(value1, value2)
    var ans2 = Substraction(value1, value2)

    println("The smaller is $ans1")
    println()
    println("$value1 - $value2 = $ans2")


}

fun minMax(a: Int, b:Int):Int = if (a<b) a else b
  /*  if ( a> b){
        return b
                     // Another manner of Function declaration
    }else{
        return a

    }*/

private fun Substraction(t : Int, m : Int) = if (t>m) t-m else throw Exception("$t is samller than $m")