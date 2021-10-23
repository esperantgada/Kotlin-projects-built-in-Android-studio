package ListsInKotlin

class Order(val orderNumber : Int) {

    /**Create an empty list of items or foods of type Foods**/
    private val foodlist = mutableListOf<Foods>()

    /**Add only one  food
     * Return an Order class instance or changed order through the keyword "This"
     * */
    fun addIOneFood(newFood : Foods): Order {
        foodlist.add(newFood)
        return this
    }

    /**Add all  foods Here, it's a list of type Foods
     * Return an Order class instance or changed order with the keyword "This"
     * */
    fun addAllFoods(newFoods : List<Foods>): Order {
       foodlist.addAll(newFoods)

        return this
    }

    fun printFoodsDetails(){
        println("Order : #$orderNumber")

        var total : Double = 0.0


        for (food in foodlist){
            println("$food : $${food.price}")
            total += food.price
        }
        println("Total : $$total")

    }
}