package dsa

class RecursiveMax {

    fun findMaximum(numbers: Array<Int>): Int {
        return findMax(numbers, 0)
    }

    private fun findMax(numbers: Array<Int>, index: Int): Int {
        if ((numbers.size - 1) == index) {
            return numbers[index]
        }

        return Math.max(numbers[index], findMax(numbers, index = index + 1))
    }
}