package minssogi.study.study_kotlin.basic

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch {
            launch(Dispatchers.Default) {
                for (i in 100L..110L) {
                    delay(i)
                    println("[$coroutineContext] delayed $i")
                }

                withContext(Dispatchers.IO) {
                    for (i in 100L..110L) {
                        delay(i)
                        println("[$coroutineContext] delayed $i")
                    }
                }

                println("Final context : $coroutineContext")
            }
        }
    }
}