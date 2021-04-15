package functions

class Order {
}
public fun String.isMale(name: String):Boolean {
    if (name.startsWith("a"))
        return true
    else
        return false
}
fun main() {
    println(String().isMale("ani"))
    println(String().isMale("yashas"))
}