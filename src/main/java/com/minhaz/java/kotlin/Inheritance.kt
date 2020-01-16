package com.minhaz.java.kotlin

open class Base(p: Int) {
    init {
        println("base init called with $p")
    }
}

class Derived(p: Int) : Base(p) {
    init {
        println("derived init called with $p")
    }
}

open class BaseWithoutPrimaryConst {
    init {
        println("BaseWithoutPrimaryConst init called")
    }
}

class Car(p: Int) : BaseWithoutPrimaryConst() {
    init {
        println("derived car init called with $p")
    }
}

enum class RoutineItemType {
    HEADER, MORNING, EVENING, TIP
}


data class RoutineItem(var itemType: RoutineItemType, var layoutId: Int) {

}

val countryCode: String? = "BD"
fun getUserCountryCode() = countryCode ?: "US"


fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    /*Derived(100)
    Car(200)*/

    sum(x = 100, y = 100)

    println(getUserCountryCode())

    println(RoutineItemType.MORNING.ordinal)

    var item = RoutineItem(RoutineItemType.MORNING, 100)
    println(item.itemType.name)

    val arr = intArrayOf(1, 2, 3)
    if (100 in arr) {
        println("in list")
    }
}