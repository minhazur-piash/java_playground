package com.minhaz.java.kotlin


fun foo(m: String, bar: (m: String) -> Unit) {
    bar(m)
}

fun String.containsDigit(): Boolean {
    val regex = Regex.fromLiteral("a13")
    return this.matches(regex)
}

fun main() {
    doSomething {
        println("msg $it")
    }

    /*Locale.getAvailableLocales().forEach { it -> println(it.country) }

    val bar: (String) -> Unit = {
        println(it)
    }
    foo("hello", bar = bar)

    Thread({

    }).start()*/
}

fun doSomething(action: (str: String) -> Unit) {
    action("hello")
}