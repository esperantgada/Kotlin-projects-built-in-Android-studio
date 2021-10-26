package Collection

fun main(){
    val list : List<Int> = listOf(1, 3, 6, 5, 9, 7, 8, 0, 4, 2, 4, 8, 7, 9, 3, 7, 1, 0,7)

    println("List : $list")
    println()
    println("Sorted list : ${list.sorted()}")
    println()
    println("Set list : ${list.toSet()}")
    println()

    val set1 = setOf<Int>(4, 2, 6, 7, 9)
    val set2 = setOf<Int>(6, 4, 9, 2, 7)
    println("$set1 == $set2 : ${set1 == set2}")
    println()
    println("Contains 7? : ${set1.contains(7)}")
    println()
    println("Intersection of $set1 and $set2 : ${set1.intersect(set2)}")
    println()
    println("Union of $set1 and $set2 : ${set1.union(set2)}")
}