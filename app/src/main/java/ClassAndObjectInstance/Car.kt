package ClassAndObjectInstance

class Car(val name: String, private val price: Int){

    fun info() : String {
        return "The price of  $name is $price"
    }
}
