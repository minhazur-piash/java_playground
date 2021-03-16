import java.util.concurrent.atomic.AtomicBoolean


object RunOnce {
    private val done = AtomicBoolean()
    fun runThis(task: Runnable) {
        if (done.get()) return
        if (done.compareAndSet(false, true)) {
            task.run()
        }
    }
}

fun main() {

    RunOnce.runThis(Runnable {
        println("Running")
    })

    RunOnce.runThis(Runnable {
        println("Running")
    })


}


fun createOnce(runFunction: ()-> Unit) {
    runFunction()
}

