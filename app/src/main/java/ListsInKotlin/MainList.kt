package ListsInKotlin

fun main() {

    /**Contains all orders
     *It will add each order
     * */
    val orderList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addIOneFood(Noodles())
    orderList.add(order1)  /**Add order1**/

    val order2 = Order(2)
    order2.addIOneFood(Noodles())
    order2.addIOneFood(Vegetables())
    orderList.add(order2)  /**Add order2**/

    val order3 = Order(3)
    order3.addIOneFood(Noodles())
    val foods = listOf(Vegetables("Onion", "Carrots", "Mil"))
    order3.addAllFoods(foods)
    orderList.add(order3)  /**Add order3**/

    val order4 = Order(4)
    order4.addIOneFood(Vegetables())
    orderList.add(order4)  /**Add order4**/

    val order5 = Order(5)
    order5.addIOneFood(Noodles())
    order5.addIOneFood(Vegetables())
    val moreFoods = listOf(Vegetables("Meals", "Beans", "Paste", "Fruits", "Yams"))
    order5.addAllFoods(moreFoods)
    orderList.add(order5)  /**Add order5**/

    /**New instance of Order class and adding it into orderList
     * Here, we use chained the call together
     */
    val order6 = Order(6)
        .addIOneFood(Noodles())
        .addIOneFood(Vegetables("Maize", "manioc", "cassava"))
    orderList.add(order6)

    /**Will take each order added in orderList and print its details by calling printFoodDetails method**/
    for(order in orderList){
        order.printFoodsDetails()
        println()
    }
}