package basics

class Test {
}
fun main(){
    var students= listOf("yashas","salman","sandesh")
    when{
        "yashas" in students-> println("from karnataka")
        "salman" in students-> println("from ap")
        "sandesh" in students->println("from tn")
    }

}