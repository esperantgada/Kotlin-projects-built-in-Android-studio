package ClassAndObjectInstance


fun main(){
    val car1 = Car("AVALON", 200000)
    val car2 = Car("VENZA", 300000)
    val car3 = Car("HILANDER", 2500000)
    val firstDice = Dice(30)
    //firstDice.size = 30
    val diceRoll = firstDice.roll()

    val res1 = car1.info()
    val res2 = car2.info()
    val res3 = car3.info()

    println("This is for Car class and it's method info")
    println(res1)
    println(res2)
    println(res3)
    println()

    println("You're working with Dice class and it's method roll")
    println(firstDice.size)
    println(firstDice.roll())

    println()

    val human = Human("Esperant GADA", "Software engineer and Android developer")
    //human.name = "Esperant GADA"
    //human.profession = " Software engineer and Android developer"
    human.humanInfo()

}

