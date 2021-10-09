package com.example.myapp

fun main(args:Array<String>){
    add()
    addN(4,8,9,6)
}

fun add(){
    repeat(5){
        println("Hello PopoKUt")
        second()
    }

    fun tred(){  //Function within another function
        println("Don't worry")
    }

    tred()//Calling the function before it works
    println()
}

fun second(){
    repeat(5){
        println("I'm back here")
    }
    println()

}

fun addN( a:Int,b:Int, c:Int,d:Int){
    print(a+b+c+d)
}