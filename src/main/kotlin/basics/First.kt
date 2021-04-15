package basics

class First {
}

fun main(){
    var a=1
    var name="yashas $a"
    var age =123;
    var sentence = "${name.replace(oldValue = "yashas",newValue = "kantharaj")}"
    //println(sentence)
    println(maxOfNumbers(10,20))
    var items = listOf("yashas","salman","ani")
    for(i in items.indices)
        println("item at $i is ${items[i]} ")
    println("\n\nwhile loop")
    var i=0
    while (i< items.size){
        println("${items[i]} is at $i")
        i++
    }
}

fun maxOfNumbers(a:Int,b:Int):Int{
   if(a>b) return a
        else
           return b
}