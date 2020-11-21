import kotlinx.coroutines.*

fun main() {

    runBlocking {
        async {
            delayedPrint()
        }
    }

}

suspend fun delayedPrint() {
    withContext(Dispatchers.IO) {
        delay(2000)
        println("delayed print")
    }
    println("normal print print")
}