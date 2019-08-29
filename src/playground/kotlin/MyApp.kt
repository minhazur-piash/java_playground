package playground.kotlin

class MyApp {

    interface X {

        fun <Q : Any, A : Any> method1(argStr: String = "", argQ: Q, argH: (A) -> Unit)

        fun <Q : Any, A : Any> method2(argQ: Q, argStr: String = "", argH: (A) -> Unit)
    }

    fun test(x: X) {

        /* Call to method1 does not work - the following errors are produced
         * Error: Kotlin: Type inference failed:
         * fun <Q : Any, A : Any> method1(argStr: String = ..., argQ: Q, argH: (A) -> Unit): Unit
         * cannot be applied to (Int,(Int) -> Unit)
         * Error: Kotlin: The integer literal does not conform to the expected type String
         * Error: Kotlin: No value passed for parameter 'argQ'
         */

        x.method1(argQ = 1) { res: Int -> println(res) }

        /* No errors here */
        x.method2(1) { res: Int -> println(res) }
    }

}