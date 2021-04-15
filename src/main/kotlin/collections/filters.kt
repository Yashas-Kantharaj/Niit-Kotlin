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
    println( "${nos.count()} nos are in the list")
    println("${nos.count() {it % 2==0}} even nos are int the list ")
    val evenOdd = nos.partition { it %2 == 0 }
    println("even nos are ${evenOdd.first}")
    println("odd nos are ${evenOdd.second}")
    val bagFruits = listOf<String>("apple","banana","chicku")
    val bagClothes = listOf<String>("shirt","pant","tie")
    val cart = listOf(bagFruits, bagClothes)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    println(mapBag)
    println(flatMapBag)

}