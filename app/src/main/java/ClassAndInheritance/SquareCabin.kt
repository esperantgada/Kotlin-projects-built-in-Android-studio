package ClassAndInheritance

 class SquareCabin(residents : Int, val length : Double) : Dwelling(residents){
     var value : Int = 6
     override val buildingMaterial = "Wood"
     override val capacity: Int = 589 / value
     override val numberDoors = 48 - value
     override val numberWindows = 56 * value
     override val nameOwner = "Seep DJAN"

     override fun floorArea(): Double {
         return length * length
     }


 }