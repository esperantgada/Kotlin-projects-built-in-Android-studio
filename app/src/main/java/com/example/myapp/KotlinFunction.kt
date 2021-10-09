package com.example.myapp

fun main(args : Array<String>){
    var x=9656
    var y= 784
    var z=minMax(x,y)
    z=minMax(x,y)
    println(z)
   var u=Substraction(x,y)

    // Asking user to enter values
    println("Enter your name:")
    var name= readLine()
    println("Enter your age:")
    var age: Int=Integer.valueOf(readLine())
    println("Your name is ${name} and your age is ${age}")

}

fun minMax(a: Int, b:Int):Int = if (a<b) a else b
  /*  if (a>b){
        return b
                     // Another manner of Function declaration
    }else{
        return a

    }*/

private fun Substraction(t:Int, m: Int)=if (t>m) t-m else throw Exception("t is samller than m")