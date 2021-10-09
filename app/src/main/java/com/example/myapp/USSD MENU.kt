package com.example.myapp

fun main(args:Array<String>) {
    var choice:Int
     println("******************WELCOME TO USSD MENU******************")
    println()
    println("Enter your code:")
    var code=readLine()
    if (code=="*200#"){

        println()
        println("           WELCOME TO YOUR MTN SERVICES MENU")
        println("**********************************************************")
        println()
        println("1- SERVICES")
        println("2- SUBSCRIPTION")
        println("3- PRICE PLAN")
        println("4- YOUR ACCOUNT")
        println("5- HELPS")
        println()

    }else{
         do {
             println("Invalid code")
             println("Check your code and enter it:")
             var code= readLine()
         }while (code!="*200#")

        println()
        println("           WELCOME TO YOUR MTN SERVICES MENU")
        println("**********************************************************")
        println()
        println("1- SERVICES")
        println("2- SUBSCRIPTION")
        println("3- PRICE PLAN")
        println()


    }

    println("Enter your choice:")
    choice = Integer.valueOf(readLine())

    when (choice) {
        1 -> {
            println("*********WELCOME TO SERVICES MENU*********")
            println("******************************************")
            println("1- MTN M2U")
            println("2- MTN LIBERTA")
            println("3- MTN CALL ME")
            println("4- MTN PAY MY CALL")
            println("5- MTN MOBILE MONEY")
            println("6- MTN EXTRA TIME")
            println("7- MTN PLAY")
            println("8- MTN XDO")
            println("9- NEXT")
            println()
            println("Enter your choice")
            choice = Integer.valueOf(readLine())

        }

        2 -> {
            println("*********WELCOME TO MTN SUBSCRIPTION MENU*********")
            println("**************************************************")
            println("1- INTERNATIONAL PACKAGE")
            println("2- MTN FLOW")
            println("3- MTN ZIK")
            println("4- MTN SMS")
            println("5- MTN MAXNET")
            println("6- RELIGIOUS INFOS PORTAL")
            println("7- NEXT")

        }

        3 -> {
            println("*********WELCOME TO YOUR ACCOUNT*********")
            println("*****************************************")
            println("1- ACCOUNT SOLD")
            println("2- ACCOUNT CHARGING")
            println("3- VOICE BONIFICATION")
            println("4- SMS BONIFICATION")
            println("5- MMS/GPRS BONIFICATION")
            println("6- MTN REWARDS")
            println("7- CONSOLE")
            println("8- NEXT")

        }
        else-> println("Invalid option")


    }

}