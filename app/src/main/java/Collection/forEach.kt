package Collection

fun main(){
    /**Using a map**/
    val peopleHeight = mutableMapOf<String, Double>("Esperant" to 1.72, "Esperance" to 1.5)
    val treesNumbers = mutableMapOf<String, Int>("Mango trees" to 56, "Orange trees" to 100)
    val enterpriseEmployees = mutableMapOf<String, Int>("UBA" to 20000000, "IBM" to 456000000)
    println(peopleHeight)
    println()
    println(treesNumbers)
    println()
    println(enterpriseEmployees)
    println()
    println()

    /**Using put to add entries to map**/
    peopleHeight.put("Judith", 1.80)
    peopleHeight["Jonas"] = 1.70

    treesNumbers.put("Carrot trees", 45987855)
    treesNumbers["Pawpaw trees"] = 154125551

    enterpriseEmployees.put("ONG", 5698743)
    enterpriseEmployees["Google"] = 651469876

    println("After adding : ")
    println(peopleHeight)
    println()
    println(treesNumbers)
    println()
    println(enterpriseEmployees)
    println()
    println()

    /**Use forEach**/
    println("USE forEach FUNCTION")
    peopleHeight.forEach{print("\n${it.key} is ${it.value}\n")}
    println()
    treesNumbers.forEach { println("${it.key} is ${it.value}")}
    println()
    enterpriseEmployees.forEach() { println("${it.value} is for ${it.key}") }
    println()
    println()

}