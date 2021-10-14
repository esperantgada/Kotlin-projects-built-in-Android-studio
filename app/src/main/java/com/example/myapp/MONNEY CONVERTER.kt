package com.example.myapp

import java.util.*
import kotlin.math.roundToLong

fun main(args:Array<String>){

    val scanner = Scanner(System.`in`)
     var choice : Int? = 0
    var repeat = true
    var taux : Double
    var value : Double

    println("***********WELCOME TO MONEY CONVERTER***********")
    println("*************************************************")

    do {
        println("Enter the money to convert: ")
        val money : Double = scanner.nextDouble()
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

        println("Enter your choice: ")
        choice = Integer.valueOf(readLine())

        if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6){

            do {
                println("Invalid answer.Please,enter a correct value: ")
                choice = Integer.valueOf(readLine())
            }while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6)

        }


        when(choice){
            1->{
                 taux = 0.848
                 value = (money * taux)
                println("""
                     ***************************************************************
                                     Conversion of $money USD to EURO
                                     $money UDS = $value EURO
                     ***************************************************************
                 """.trimIndent())
            }

            2->{
                 taux = 1.18
                 value = (money * taux)
                println("""
                     ***************************************************************
                                     Conversion of $money EURO to USD
                                     $money EURO = $value USD
                     ***************************************************************
                 """.trimIndent())
            }

            3->{
                 taux = 550.2
                 value = (money * taux).toLong().toDouble()
                println("""
                     ***************************************************************
                                     Conversion of $money USD to XAF
                                     $money UDS = $value XAF
                     ***************************************************************
                 """.trimIndent())
            }

            4->{
                 taux = 0.002
                 value = (money * taux)
                println("""
                     ***************************************************************
                                     Conversion of $money XAF to USD
                                     $money XAF = $value USD
                     ***************************************************************
                 """.trimIndent())
            }

            5->{
                 taux = 648.74
                 value = (money * taux).toLong().toDouble()
                println("""
                     ***************************************************************
                                     Conversion of $money EURO to XAF
                                     $money EURO = $value XAF
                     ***************************************************************
                 """.trimIndent())
            }

            6->{
                 taux = 0.001
                 value = (money * taux).toLong().toDouble()
                println("""
                     ***************************************************************
                                     Conversion of $money XAF to EURO
                                     $money XAF = $value EURO
                     ***************************************************************
                 """.trimIndent())
            }

            else-> println("Invalid choice!")
        }


        println()
        println("""
        Do you want to do another conversion?
        1.Yes       2.No   
    """.trimIndent())

        var response = scanner.nextInt() //Getting the value entered by the user

        when (response) {
            1 -> {
                repeat = true
            }


            2 -> {
                repeat = false
                println("Thanks! See you soon.")
            }

            else -> do {
                println(
                    """
                    Invalid option!
                    Choose 1 or 2.
                    Do you want to continue?
                    1.Yes     kh  2.No
                """.trimIndent()
                )
                response = scanner.nextInt()

                repeat = if (response == 1) {
                    true
                }else {
                    false
                }

            } while (response != 1 && response != 2)


        }

    }while (repeat)

}

