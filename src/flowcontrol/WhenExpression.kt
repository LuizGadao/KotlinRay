package flowcontrol

fun main(args: Array<String>) {
    val n = 10

    when (n) {
        0 -> println("number is zero")
        10 -> println("number is ten")
    }

    when (n) {
        in 1..9 -> println("between 1 and 9")
        in 10..20 -> println("between 10 and 9")
    }

    when {
        n % 2 == 0 -> println("Even")
        else -> println("Odd")
    }

    val str = "Dog"
    when (str) {
        "Dog", "Cat" -> println("animal is a house pet")
        else -> println("animal is not a pet house")
    }

}