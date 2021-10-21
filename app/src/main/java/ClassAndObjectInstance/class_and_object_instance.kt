package ClassAndObjectInstance


fun main(){
    val car1 = Car("AVALON", 200000)
    val car2 = Car("VENZA", 300000)
    val car3 = Car("HILANDER", 2500000)

    val res1 = car1.info()
    val res2 = car2.info()
    val res3 = car3.info()

    println(res1)
    println(res2)
    println(res3)

    println()

    val human = Human()
    human.name = "Esperant GADA"
    human.profession = " Software engineer and Android developer"
    human.humanInfo()

}

