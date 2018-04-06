fun main(args: Array<String>) {
    val pair = Pair(1, 10)
    val (x, y) = pair

    println("value x: $x value y:$y")
    var pairD = Pair(3.0, 89.0)
    println("value x: ${pairD.first} value y:${pairD.second}")

    var triple = Triple(19.0, 22.0, 10)
    var (x1, y1, z1) = triple
    println("value x: $x1 value y:$y1 value z: $z1")

    var (x3, y2, _) = triple
    println("value x: ${triple.first} value y:${triple.second} value z: ${triple.third}")


    // Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
    val date = Pair(12, 7)

    // In one line, read the day and month values into two constants.
    val day = date.second
    val month = date.first
    println("Day: $day \nMonth: $month")

    //  Now create a Triple using the month, day and year
    val dateYear = Triple(12, 7, 1986)

}