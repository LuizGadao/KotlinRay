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


}

fun printLine() {
    println("\n==================================================")
}