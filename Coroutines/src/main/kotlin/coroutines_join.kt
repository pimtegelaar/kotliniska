import kotlinx.coroutines.*

fun main() = runBlocking {

    // launch a new coroutine and keep a reference to its Job
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}