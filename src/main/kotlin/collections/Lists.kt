package collections

class Lists {
}

    fun adduser(newuser: Int,list: MutableList<Int>) {
        list.add(newuser)
    }

    fun main() {
        val users: MutableList<Int> = mutableListOf(1, 2, 4, 5)
        var otherList: List<Int> = users
        println("users: $otherList")
        adduser(8,users)
        println("After adding new user: $otherList")
    }

