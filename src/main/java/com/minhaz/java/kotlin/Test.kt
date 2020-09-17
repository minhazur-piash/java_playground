package com.minhaz.java.kotlin

import java.util.*


fun foo(m: String, bar: (m: String) -> Unit) {
    bar(m)
}

fun String.containsDigit(): Boolean {
    val regex = Regex.fromLiteral("a13")
    return this.matches(regex)
}

fun main() {
    println("a13bc".containsDigit());

    /*Locale.getAvailableLocales().forEach { it -> println(it.country) }

    val bar: (String) -> Unit = {
        println(it)
    }
    foo("hello", bar = bar)

    Thread({

    }).start()*/
}