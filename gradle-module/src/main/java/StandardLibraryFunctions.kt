class Company {
    var name: String = "Default value"

    override fun toString(): String {
        return "Company(name='$name')"
    }
}

fun main() {
    val company: Company? = Company()
    val let = company?.let {
        it.name = "Updated in let"
        "hey"
    }
    println("after let: $let")

    val apply = company?.apply {
        name = "Updated in apply"
    }

    println("after apply: $apply")

    val name: String? = "hey"

    val capitalize = name?.firstOrNull()?.toUpperCase()?.toString()
    println(capitalize)

    for (i in 1 until 1) {
        println(i)
    }

}