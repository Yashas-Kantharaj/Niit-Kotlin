package collections


var issues: MutableSet<String> = mutableSetOf("issue1","issue2","issue3","issue4")

fun addIssue(issue :String):Boolean{
    if(issues.add(issue)){
        println("issue added successfully")
        return true
    }

    else{
        println("issue exists")
        return false
    }
}
fun main() {
    println(issues)
    println(addIssue("issue4"))
    println(issues)
    println(addIssue("issue5"))
    println(issues)
}
