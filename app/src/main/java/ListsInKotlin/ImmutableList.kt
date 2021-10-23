package ListsInKotlin

import com.example.myapp.printCakeTop

fun main() {

    /**Unmodified list**/
    val numbers : List<Int> = listOf(1, 98, 20, 82, 40, 100, 2, 5, 9, 41,65, 32, 0, 15, 45, 78)
    val colors = listOf("black", "red", "blue", "white", "gray")
    var i : Int

    println("Elements : $numbers")
    println()
    println("Size : ${numbers.size}")
    println()

    for (i in 0..5)
        println("The element at position $i is ${numbers.get(i)}\n")

    println()
    println("The last index is : ${numbers.size - 1}")
    println("The last element is : ${numbers.get(numbers.size - 1)}")
    println()

    /**Check if a value is in the list**/
    println("The number 41 is in the list: ${numbers.contains(41)}")
    println("The number 25 is in the list: ${numbers.contains(25)}")
    println()

    /**Sort and reverse the lists**/
    println("Reversed list : ${numbers.reversed()}")
    println("Sorted list : ${numbers.sorted()}")
    println()
    println("String list reversed : ${colors.reversed()}")
    println("String list sorted: ${colors.sorted()}")

}