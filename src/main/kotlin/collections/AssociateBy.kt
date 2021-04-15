package collections

class AssociateBy {
}
data class Person(val name: String,val city: String, val phone:Int)

var people= listOf<Person>(
    Person("yashas","bangalore",98455),
    Person("abdul","bangalore",9845),
    Person("salman","hassan",98445),
    Person("sandesh","shivamoga",98555),
    Person("samarth","shivamoga",984585)

)
fun main() {
    val phonebook =people.associateBy { it.city }
    println(phonebook)
}