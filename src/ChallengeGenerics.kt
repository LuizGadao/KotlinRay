fun <T> printGenericItem(t: T) {
    println(t)
}

fun <T> printGenericList(t:List<T>) {
    t.forEach { println(it) }
}

fun main(args: Array<String>) {
    printGenericItem(1)
    printGenericItem("Luiz")
    printGenericItem(Pair("Luiz", 55))

    println("----------------------------------------")
    printGenericList(listOf("Luiz", "Carlos", "Anjos"))
}