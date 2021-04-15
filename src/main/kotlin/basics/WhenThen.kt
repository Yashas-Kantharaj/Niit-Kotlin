package basics

class WhenThen {
}
fun main(){
    println(describe(2))
    println("hello")
}
fun describe(obj:Any):String{
    return when(obj){
        1 -> "one"
        "hello" -> "greeting"
        is Long -> "long no"
        !is String -> "its not a string"
        else -> "unknown"
    }
}