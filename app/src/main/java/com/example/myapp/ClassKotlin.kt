package com.example.myapp

fun main(args:Array<String>){
   var user1=USERS()
    user1.firstName="Espérant"
    user1.lastName="GADA"

    var user2=USERS()
    user2.firstName="Karen"
    user2.lastName="KPOKOU"

    //Calling of method or function from USERS class
    user1.fullName()
    println()
    user2.fullName()

    println("${user1.firstName}")
    println("${user1.lastName}")
    println()
    println()
    println("${user2.firstName}")
    println("${user2.lastName}")

    var car1=CARS("Venza",40000000,"Black")
    var car2=CARS("Range Rover",50000000,"White")
    car1.details()
    println()
    car2.details()
}

class USERS{
    var firstName:String=""
    get() = "Other:$field"
    var lastName: String=""
    get() = "Individual:$field"

    //Use of setter
    set(value) {
        if(value.startsWith('E' ) || value.startsWith('K')) {
            field = "Her husband"
        }else{
            field=value
        }
    }


    //Method for displaying firstName and lastName within the class USERS
    fun fullName(){
        println("$firstName  $lastName")
    }
}

//Class with constructor keyword
class CARS constructor(var name:String,var price:Int,var color:String){
    fun details(){
        println("$name $price $color")
    }
}
