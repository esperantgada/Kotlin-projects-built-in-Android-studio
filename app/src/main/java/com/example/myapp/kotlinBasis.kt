package com.example.myapp

fun main(args : Array<String>){
    println("Hello from Espérant!")

    // Variables declaration
    val word="I'm here now"
    println (word)
    var phrase="The life is beautiful"
    phrase="But it is a little difficult"
    println (phrase)
    /*var ans=true
    var i=0
    var valuee=phrase[phrase.length]
    while (ans && i<10)
    {
        println(phrase[i])
        i++
    }*/

    //Use of when in kotlin
    var x: Any="Espérant"
    when (x)
    {
        is Int-> println("$x is an integer")
        is Double-> println("$x is a double")
        is String -> println("$x is a string")
        is Char -> println("$x is a char")
        else -> println("None of the above")
    }

    var month=1
    when (month)
    {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Autumn") // or "DownTo" instead of 12,1,2
        else -> println("None of the above")
    }

    var season=5
    when (season)
    {
        1-> print("Spring")
        2-> print("Summer")
        3-> print("Fall and Autumn")
        4-> print("Winter")
        else -> print("None of the above")
    }

    //For loop using
    for (i in 1..10)
    {
        println(i)
    }

    for (i in 1 until 5 )
    {
        println(i)
    }

    for (i in 40 downTo 1 step 4)
    {
        println(i)
    }

    myFunction()

    var resul= add(5,45)
    println("The sum is "+ resul)
    var aver=average(78.0,45.0)
    println(aver)
}

// Functions creating. A method is a function within a class
fun myFunction(){
    println("I'm not created yet")
}

fun add(a: Int, b:Int): Int{
    return a+b
}

fun average(a:Double, b:Double): Double{
    return (a+b)/2
}
