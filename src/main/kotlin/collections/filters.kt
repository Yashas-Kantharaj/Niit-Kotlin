package collections

class filters {
}
var nos= listOf<Int>(1,-2,3,-4,5,-6,7)

fun main() {
    println(nos)
    val postives=nos.filter { it > 0}
    println("Postive nos: $postives")
    val doubles=nos.map{ x -> x*x}
    println("Doubles nos: $doubles")
    println("Any nos greater than 3: "+ nos.any{it>2})
    println("All nos greater than 4: "+ nos.all{it <4})
    println("none nos greater than 5: "+ nos.none{it > 5})
}