package namedArguments

class StringTemplayes {
}
fun main() {
    val (x,y,z) = arrayOf(5,10,15)
    val map = mapOf( "yashas" to 21, "sandesh" to 20)
    for((name,age) in map){
        println("$name in $age")
    }
    println(x)
    val greeting = "welcome"
    println("$greeting to java")
    println("${greeting.toUpperCase()} to java")
}

fun findMinMax(listOf: List<Int>): Any {
    return 0

}