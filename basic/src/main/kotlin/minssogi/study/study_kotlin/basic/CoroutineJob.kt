package minssogi.study.study_kotlin.basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
            println("Job1 launched")
//            delay(3000)
//            println("job1 finished")
            val job2 = launch {
                println("job2 launched")
                delay(3000)
                println("job2 finished")
            }
            job2.invokeOnCompletion { println("job2 completed") }

            val job3 = launch {
                println("job3 launched")
                delay(3000)
                println("job3 finished")
            }
            job3.invokeOnCompletion { println("job3 completed") }
        }

        job1.invokeOnCompletion { println("Job1 completed") }

        delay(500)
        println("Job1 will be canceled")
        job1.cancel()
    }
}