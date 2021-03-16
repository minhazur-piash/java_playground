import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val task = async {
        doSomething()
    }
//    task.join()

    println("Completed")
}

fun doSomething() {
    throw UnsupportedOperationException("Can't do")
}