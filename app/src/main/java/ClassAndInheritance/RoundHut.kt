package ClassAndInheritance

import kotlin.math.PI

open class RoundHut(residents : Int, val radius : Double, val value : Int = 5) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 10 * value
    override val numberDoors = 40
    override val numberWindows = 30
    override val nameOwner = "Adjoni ANGI"


    override fun floorArea(): Double {
        return PI * radius * radius
    }

}