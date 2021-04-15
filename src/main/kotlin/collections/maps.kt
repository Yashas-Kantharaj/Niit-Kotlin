package collections

class maps {
}
var students: MutableMap<Int, String> = mutableMapOf();

fun main() {
    students.put(212,"yashas")
    students.put(75,"ani")
    students.put(167,"sandesh")
    students.put(213,"yashaswini")
    students.put(45,"avinash")

    println(students)
    val filteredMap = students.filter { (key, value) ->
        value.startsWith("a")}
    println(filteredMap)

}