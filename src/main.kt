fun main(args: Array<String>) {
    var name = "Luiz"

    name = "Luiz Carlos"

    fun calcTemperature(celsius : Double) : Double {
        return 9.0 / 5.0 * celsius + 32
    }
    println(name)
    println("temperature: ${calcTemperature(20.0)}")

    val intValue = "32".toInt()
    println("int value: $intValue")

    val intStr = 32.toString()
    println("int string $intStr")

    val fahrenheit = 32
    when (fahrenheit) {
        in 0..32 -> println("really cold")
        in 31..40 -> println("getting colder")
        in 41..50 -> println("kind of cold")
        in 51..60 -> println("Nippy")
    }

    var nullableName : String? = null
    var len = nullableName?.length ?: -1
    println(len)

    nullableName = "Luiz Carlos"
    len = nullableName?.length
    println(len)

}