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
    for (s in students){
        if (s.value.startsWith("a"))
            println(s)
    }

}