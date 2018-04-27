import java.util.Arrays.asList

fun main(args: Array<String>) {
    fun handleInt(value1: Int,  action: (v1:Int, v2:Int) -> Unit) {
        action(value1, 10)
    }

    handleInt(5, { v1, v2 ->  println("value: ${v1 * v2}") })

    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    // Your Solution Here
    val myList = asList(1, 2, 4, 5, 6, 9, 12, 15, 18, 21)
    //myList.filter({it > 5}).forEach { println(it) }
    println(myList.filter { it > 5 }.sum())

    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val age:Int, val name:String)
    val luiz = Person(31, "Luiz Carlos Gonçalves dos anjos")

    val (age, name) = luiz
    println("age: $age, name: $name")

    /**
     * Print out the index and value of the map below
     */
    val names = mapOf<Int, String>(Pair(22, "Isac"), 31 to "Luiz", 25 to "Lucas", 24 to "Luan")
    for ((age, name) in names) {
        println("name: $name age:$age")
    }
}