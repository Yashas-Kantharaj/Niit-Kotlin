package delegation


import kotlin.reflect.KProperty

class  Example{
    var s: String by Delegate()
    override fun toString(): String {
        return "Example class"
        //super.toString()
    }
}

class Delegate(){
    operator fun getValue(thisRef: Any, prop:KProperty<*>): String{
        return "$thisRef, thank you for delegating ${prop.name}"
    }
    operator fun setValue(thisRef: Any, prop: KProperty<*>, value: String){
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.s)
    var st = Student("yashas",22)
    println("${st.name},${st.age}")

}
class DelegationProperties {
}