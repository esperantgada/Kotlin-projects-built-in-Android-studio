package Collection

fun main(){
    val lambda1 : (Int) -> Int = {x : Int -> x * 50}

    /**Another way to do declare a lambda with the key word it**/
    val lambda2 : (Int) -> Int = {it * 50}

    val v1 = lambda1(10)
    val v2 = lambda2(10)

    println("lambda1 output : $v1")
    println()
    println("lambda2 output : $v2")
    println()

    val lambda3 : (Int, Int) -> Boolean = {a : Int, b : Int -> a < b}
    val v3 = lambda3(45, 23)
    println(v3)
    println()

    val lambda4 : (List<String>) -> List<String> = {it.reversed()}
    val v4 = lambda4(listOf("Esperant", "Tenessy", "Karen", "Roger", "Julien", "Marc", "Esperance"))
    println(v4)
}