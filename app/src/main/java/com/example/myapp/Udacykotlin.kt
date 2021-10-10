package com.example.myapp

import kotlin.math.pow

fun main (args:Array<String>){
    var nullTest:Int? = null

    println(nullTest?.inc()?:0)

    var array1=Array(5){it+2}
    println("${array1.asList()}")
    println()

    /**Conversion**/
    var conv = arrayOf("byte","kilobyte","megabyte","gygabyte","terabyte","petabyte","exabyte")
    var array = Array(7){1000.0.pow(it)}
    for ((i,value ) in array.withIndex()){
        println("1 ${conv[i]} = ${value.toLong()} bytes")
    }
}