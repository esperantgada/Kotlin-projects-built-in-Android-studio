package ListsInKotlin

/**The vararg is a modifier used to pass variables numbers of arguments of same type into a function**/

class Vegetables(vararg val foods : String ) : Foods("Vegetables", 500.5){

    override fun toString(): String {

        if (foods.isEmpty())
            return "$name Chef's choice"

        else
            return name + " :" + " " + foods.joinToString(", ") + " " + "--> "
    }
}