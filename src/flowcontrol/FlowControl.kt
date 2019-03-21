package flowcontrol

fun main(args: Array<String>) {
    var i = 1

    while (i <= 10 ) {
        print("$i-")
        i++
    }

    printLine()

    do {
        i--
        print("$i-")
    } while (i > 1)

    printLine()

    val count = 10
    for (n in 5..count) {
        print("$n")
        if (n < count) {
            print(",")
        }
    }

    for (i in 1..5) {
        for (n in 1..5) {

        }
    }

}

fun printLine() {
    println("\n==================================================")
}