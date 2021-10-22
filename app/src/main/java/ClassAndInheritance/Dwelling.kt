package ClassAndInheritance

abstract class Dwelling(private var residents : Int) {
    abstract val buildingMaterial : String
    abstract val capacity : Int
    abstract val numberDoors : Int
    abstract val numberWindows : Int
    abstract val nameOwner : String


    fun hasRoom() : Boolean{
        return residents < capacity
    }

    abstract fun floorArea() : Double

     fun getRoom(){
         if (capacity > residents){
             residents++
             println("There are $residents residents")
             println("Congratulation, you got a Room!!")
         }else{
             println("Sorry, there is not enough spaace!!")
         }
     }

}