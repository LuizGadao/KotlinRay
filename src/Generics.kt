
interface Repository<T> {
    fun addItem(item: T)
    fun removeItem(item: T)
}

data class Person(val age:Int, val name:String)

class PersonRepository : Repository<Person> {

    var list:MutableList<Person> = mutableListOf()

    override fun addItem(item: Person) {
        list.add(item)
    }

    override fun removeItem(item: Person) {
        list.remove(item)
    }

    override fun toString(): String {
        return list.toString()
    }
}

fun <T> prontType(type:T) {
    println(type)
}

fun main(args: Array<String>) {
    val personRepository = PersonRepository()

    val luiz = Person(22, "Luiz")
    val luiz1 = Person(22, "Luiz1")
    val luiz2 = Person(22, "Luiz2")
    val luiz3 = Person(22, "Luiz3")
    
    personRepository.addItem(luiz)
    personRepository.addItem(luiz1)
    personRepository.addItem(luiz2)
    personRepository.addItem(luiz3)
    println(personRepository)

}