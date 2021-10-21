package ClassAndObjectInstance

class Dice(var size : Int){

    fun roll() : Int{
        var randomNumber = (1..size).random()

        if (randomNumber == size){
            println("Congratulation!!")
            size *= 3
            randomNumber = size
        }
        return randomNumber
    }
}