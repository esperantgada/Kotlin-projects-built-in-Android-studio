package ListsInKotlin

fun main(){
    val entrees = mutableListOf<String>()

    /**Empty list**/
    println("Entrees : $entrees")
    println()


    /**Add and check  if the item is added successfully**/
    println("Add item successful? : ${entrees.add("noddles")}")
    println("Entrees : $entrees")
    println()

    /**Add another item**/
    println("Add item successful? : ${entrees.add("Spaghetti")}")
    println("Entrees : $entrees")
    println()

    /**Create another list for more items**/
    val moreItems = mutableListOf<String>("Fruits", "Mangos", "School", "Chalk", "Computer", "Sciences")
    println("More items list : $moreItems")
    println()

    /**Add all items of moreItems to entrees list**/
    println("Add all items successful? : ${entrees.addAll(moreItems)}")
    println("Update entrees : $entrees")
    println()

    /**Remove an item from the list : Computer**/
    println("Remove Computer from the list successfully : ${entrees.remove("Computer")} ")
    println("Updated entrees list : $entrees")
    println()

    /**Using index to remove an item**/
    println("Remove item at position 4? : ${entrees.removeAt(4)}")
    println("Updated entrees list : $entrees")
    println()

    /**Clear all items from the list**/
    println("Clear the list:")
    entrees.clear()
    println("Updated entrees list : $entrees")
    println()

    /**Check if the entrees list is empty**/
    println("Is list empty after clearing it? : ${entrees.isEmpty()}")
    println()


}