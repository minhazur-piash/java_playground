package com.minhaz.java.kotlin

import java.util.*


fun foo(m: String, bar: (m: String) -> Unit) {
    bar(m)
}

fun main() {

    Locale.getAvailableLocales().forEach { println(it.country) }

    val bar: (String) -> Unit = {
        println(it)
    }
    foo("hello", bar = bar)
}