package ClassAndObjectInstance

class Human(val name: String, val profession : String) {

    fun humanInfo(){
        println("You're using Human class and humanInfo method")
        println("$name is a $profession")
    }
}