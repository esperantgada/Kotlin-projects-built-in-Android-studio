package com.example.myapp

import java.util.*

fun main(args:Array<String>){
    var scanner= Scanner(System.`in`)
     var choice:Int?=null
    var repeat=true
    //var taux:Double
   // var value:Double
    println("***********WELCOME TO MONEY CONVERTER***********")
    println("*************************************************")

    do {
        println("Enter the money to convert:")
        var money:Double=scanner.nextDouble()
        println()

        println("""
           Convert from:
         1- USD (${'$'}) to EURO (£)
         2- EURO (£) to USD (${'$'})
         3- USD to XAF
         4- XAF to USD
         5- EURO to XAF
         6- XAF to EURO
    """.trimIndent())
        println()
        println("Enter your choice")
        choice=Integer.valueOf(readLine())

        when(choice){
            1->{
                var taux=0.848
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money USD to EURO
                                     $money UDS = $value EURO
                     ***************************************************************
                 """.trimIndent())
            }

            2->{
                var taux=1.18
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money EURO to USD
                                     $money EURO = $value USD
                     ***************************************************************
                 """.trimIndent())
            }

            3->{
                var taux=550.20
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money USD to XAF
                                     $money UDS = $value XAF
                     ***************************************************************
                 """.trimIndent())
            }

            4->{
                var taux=0.002
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money XAF to USD
                                     $money XAF = $value USD
                     ***************************************************************
                 """.trimIndent())
            }

            5->{
                var taux=648.74
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money EURO to XAF
                                     $money EURO = $value XAF
                     ***************************************************************
                 """.trimIndent())
            }

            6->{
                var taux=0.001
                var value=money * taux
                println("""
                     ***************************************************************
                                     Conversion of $money XAF to EURO
                                     $money XAF = $value EURO
                     ***************************************************************
                 """.trimIndent())
            }

            else-> println("Invalid option")
        }


        println()
        println("""
        Do you want to do another conversion?
        1.Yes       2.No   
    """.trimIndent())

        var response=scanner.nextInt() //Getting the value entered by the user

        do {
            println("""
                    Invalid option!
                    Choose 1 or 2.
                    Do you want to continue?
                    1.Yes       2.No
                """.trimIndent())
            response=scanner.nextInt()

            }while (response!=1 && response!=2)

        when (response) {
            1 -> {
                repeat = true
            }


            2 -> {
                repeat = false
                println("Thanks! See you soon.")
            }

            else-> println("See you soon!")


        }

    }while (repeat)

}

