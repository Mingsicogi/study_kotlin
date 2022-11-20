package minssogi.study.study_kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val longTask = launch {
        repeat(1000) {
            println("[longTask - ${Thread.currentThread().name}] $it start and delay 1 second")
            delay(1000)
        }
    }

    val shortTask = launch {
        repeat(1000) {
            println("[shortTask - ${Thread.currentThread().name}] $it start and delay 500 milli seconds")
            delay(500)
        }
    }

    println("Delay main task for 3 seconds")
    delay(3000)
    println("Finish main task")

    longTask.cancel()
    shortTask.cancel()

    longTask.join()
    shortTask.join()
}