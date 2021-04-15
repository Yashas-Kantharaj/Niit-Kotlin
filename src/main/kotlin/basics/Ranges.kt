package basics

class Ranges {

}
fun main(){
    println(range(15))
    println(range(555))
    println(range(2895))
    println(range(51512))
}
fun range(x:Int):String {
    return when(x){
        in 1..99 -> "its in 10s"
        in 100..999 -> "its in 100s"
        in 999..9999->"its in 1000s"
        else -> "Unknown"
    }
}