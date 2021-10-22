package ClassAndInheritance

fun main(){
    val squareCabin = SquareCabin(56, 70.5)
    val roundHut = RoundHut(3, 20.0, 30)
    val roundTower = RoundTower(10, 45.0)


    /**The key word *with* is used to avoid redundant variable**/

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Floor Area : ${floorArea()}")
        println("Has Room? : ${hasRoom()}")
        println("Number of Door : $numberDoors")
        println("Number of Windows : $numberWindows")
        println("Owner : $nameOwner")
    }

    println()

    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Floor Area : ${floorArea()}")
        println("Has Room? : ${hasRoom()}")
        getRoom()
        println("Has Room? : ${hasRoom()}")
        getRoom()
        println("Number of Door : $numberDoors")
        println("Number of Windows : $numberWindows")
        println("Owner : $nameOwner")
    }


    println()

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Floor Area : ${floorArea()}")
        println("Has Room? : ${hasRoom()}")
        println("Number of Door : $numberDoors")
        println("Number of Windows : $numberWindows")
        println("Owner : $nameOwner")
    }

}