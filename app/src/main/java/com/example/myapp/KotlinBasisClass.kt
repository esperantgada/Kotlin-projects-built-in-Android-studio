package com.example.myapp

fun main(args : Array<String>){
    var info = Person("Espérant","GADA")
    info.myHobby()

   var karen = Person("Karen","KPOKOU")
    karen.hobby = "Watching films and series"
    karen.myHobby()

   var peniel = Person("Péniel","AFATON")
    peniel.hobby = "Playing games and singing for the Lord"
    peniel.myHobby()

   var phoebe = Person("Phoébé","ASSIMANDA")
    phoebe.hobby = "Dancing and studying"
    phoebe.myHobby()

   var marie = Person("Marianique","GOUHOUEDE")
    marie.hobby = "Writing poems and texts"
    marie.myHobby()

   var judith= Person("Judith","ATINGNISSO")
    judith.hobby = "Reading bible and singing"
    judith.myHobby()

   var math = Person("Mathilde","ATINGNISSO")
    math.hobby = "Supervision and reading bible"
    math.myHobby()

}

class Person(firstName : String, lastName : String){
    //Members variables or Properties
    //var age: Int? = null
    var hobby = "Watching football"
    var firstName : String? =null

    //Initialiseur
   init {
       this.firstName = firstName
       println("FirstName: "+ firstName+ "   LastName: "+ lastName)
   }

    //Member Function or Method (Function in a class
    fun myHobby(){
        println("$firstName\'s hobby is "+ hobby+"\n")
    }

}