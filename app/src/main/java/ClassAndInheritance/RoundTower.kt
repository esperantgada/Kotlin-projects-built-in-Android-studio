package ClassAndInheritance


class RoundTower(residents : Int, radius : Double, val floors : Int = 2) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = 45 * floors
    override val numberDoors = 62 * floors
    override val numberWindows = 80 / floors
    override val nameOwner = "Queen RIAN"

    /**Will multiply the returned type of the method in RoundHum by floor**/
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }

}