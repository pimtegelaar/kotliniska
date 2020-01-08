import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(2000L)
        println("Task from runBlocking")
    }

    coroutineScope {
        launch {
            delay(3000L)
            println("Task from nested launch")
        }

        delay(1000L)
        println("Task from coroutine scope") // This line will be printed before the nested launch
    }

    println("Coroutine scope is over") // This line is not printed until the nested launch completes
}