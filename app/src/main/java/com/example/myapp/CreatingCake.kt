package com.example.myapp

fun main(args: Array<String>){
    val age=24
    val  layers=6

    println()
    println()

    //Functions calling
    printCakeCandle(age)
    printCakeTop(age)
    printCakeBottom(age,layers)
}

fun printCakeTop(age:Int){
    repeat(age+2){
        print("=")
    }
    println()
}

fun printCakeCandle(age:Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int,layer:Int){
    repeat(layer){
        repeat(age+2){
            print("@")
        }
        println()

    }
    println()
    println()
}

