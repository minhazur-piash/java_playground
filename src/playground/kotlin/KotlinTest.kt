package playground.kotlin

class KotlinTest {
    private val number: Int = 0

    companion object {
        fun test(args: String) {
            callCallbackMethod { t ->
                println(t)
            }

            val isOk = 1
            if (isOk != 1 || isOk != 2) {
                println("false")
            }



           /* val studentsId: ArrayList<Int> = ArrayList()
            studentsId.add(1)
            studentsId.add(4)
            studentsId.add(4)
            studentsId.add(3)

            val groups = studentsId.groupBy { it }
            groups.forEach { k, v ->
                println("$k = ${v.count()}")
            }*/

            val savedValue = SavedValue("new", "old")
            println(savedValue.toString())

            savedValue.currentValue = "current"
            println(savedValue.toString())

        }

        private fun redFromStd() {
            var line = readLine()
            while (line != null) {
                println(line)
                line = readLine()
            }
        }

        fun callCallbackMethod(callback: (String) -> Unit) {
            callback("test");
        }


        fun redFromStdAndPrint() {
            var line = readLine()
            while (line != null) {
                val totalApples = line.toInt()

                line = readLine()
                val giaHasMore = line!!.toInt()

                val maddieHas = (totalApples - giaHasMore) / 2
                val giaHas = maddieHas + giaHasMore

                println(giaHas)
                println(maddieHas)

                line = readLine()
            }
        }


    }

}