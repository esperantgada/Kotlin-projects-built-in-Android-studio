package com.example.myapp


fun main(args: Array<String>){
    val border = "%"
    val  border1 = "*"
    val border2 = ":"
    val border3 = "`-._,-'"
    val  border4 = 4;

    printBorder1(border)
    println("Happy Birthday, Espérant!")
    printBorder1(border)
    println()
    println()

    printBorder1(border1)
    println("Happy Birthday, Espérant!")
    printBorder1(border1)
    println()
    println()

    printBorder1(border2)
    println("Happy Birthday, Espérant!")
    printBorder1(border2)
    println()
    println()

    printBorder2(border3,border4)
    println("Happy Birthday, Espérant!")
    printBorder2(border3,border4)
    println()
    println()


}

fun printBorder1(border:String){
    repeat(25){
        print(border)
    }
    println()

}

//Other way of creating printBorder function
 fun printBorder2(border:String,timeToRepeat:Int){
    repeat(timeToRepeat){
        print(border)
    }
    println()

}

