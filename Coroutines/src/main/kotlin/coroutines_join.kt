import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}