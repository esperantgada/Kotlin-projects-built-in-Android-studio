package Collection

fun main(){
    val word = listOf("Aquarium", "month", "museum", "art", "balloon", "ancient", "Chalk", "Among", "Front", "about")

    /**Get the list of words starting with b by using filter function*
     * The key word "ignoreCase" is used to ignore upper or lowercase behavior
     */
    val filterWord = word.filter { it.startsWith("a", ignoreCase = true) }

    /**before shuffling**/
    println("Before shuffling: ")
    println(filterWord)
    println()

    /**After shuffling**/
    println("After shuffling : ")
    val shuffleFilterWord = word.filter { it.startsWith("a", ignoreCase = true) }
        .shuffled()
    println(shuffleFilterWord)
    println()

    /**Using the function take() to get a number of element**/
    println("Using take function to get 3 words from the shuffled word : ")
    val takeShuffleFilterWord = word.filter { it.startsWith("a", ignoreCase = true) }
        .shuffled()
        .take(3)
    println(takeShuffleFilterWord)
    println()



}