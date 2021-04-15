package collections

class filters {
}
var nos= listOf<Int>(1,-2,3,-4,5,-6,7)

fun main() {
    println(nos)
    val postives=nos.filter { it > 0}
    println("Postive nos: $postives")

}