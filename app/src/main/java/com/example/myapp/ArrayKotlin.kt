package com.example.myapp

import java.util.*

fun main(args : Array<String>)
{
    var num = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    println(Arrays.toString(num))
    println(num[12])
    println(num.last())
    println(num.first())

    val even= num.count{it % 2 == 0}
    println("There are ${even} multiple of 2 in this table")

    //Sorting array
    var element = num.sortedArrayDescending()
    println(Arrays.toString(element))

    //The number of a table elements displaying
    println("There are ${num.count()} elements in the table")
    println("There are ${num.size} elements in Table")


}
