import kotlinx.coroutines.*

fun main() {

    runBlocking {
        async {
            delayedPrint()
        }

        launch(Dispatchers.Main) {

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