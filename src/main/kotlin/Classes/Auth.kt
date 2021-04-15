package classes

object Auth {
    fun takeCredential(name: String, password: String) {
        println("loggin in with $name and $password ")
    }
}


    fun main(args: Array<String>) {
        Auth.takeCredential("Yashas k","password")

    }
