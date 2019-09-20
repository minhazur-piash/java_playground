import coursera.princeton.algorithm.ShellSort

fun main() {
    val numbers = intArrayOf(3, 2, 100, 1, 4, 5, 200, 49, 40, 12, 7)
    val shellSort = ShellSort(numbers)
    shellSort.apply().forEach {
        print("$it ");
    }
}