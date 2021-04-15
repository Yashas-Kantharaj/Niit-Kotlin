package functions

class Lamda {
}
@ExperimentalStdlibApi
fun main() {
    val upperCase1 : (String) -> String = {str: String -> str.toUpperCase()}
    val upperCase2: (String) -> String ={str -> str.toUpperCase()}
    val upperCase3 = {str: String -> str.toUpperCase()}
    val upperCase4: (String) -> String = {it.toUpperCase()}
    val upperCase5: (String) -> String = String::uppercase
    println(upperCase1("hello"))
    println(upperCase2("this"))
    println(upperCase3("is"))
    println(upperCase4("yashas"))
    println(upperCase5("kantharaj"))


}