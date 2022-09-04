package minssogi.study.study_kotlin.basic

import kotlinx.coroutines.*
import java.lang.Exception
import java.lang.RuntimeException

fun main() {

    runBlocking {
        val myHandler = CoroutineExceptionHandler{coroutineContext, throwable -> println("### $coroutineContext," +
                "${throwable.message}") }

        val job1 = GlobalScope.launch(Dispatchers.Default + myHandler) {
            println("throwing exception from job")
            throw RuntimeException("runtime error from job1 ~~")
        }
        job1.join()

        val deffered = GlobalScope.async {
            println("throwing exception from async")
            throw RuntimeException("runtime error from async ~~")
        }
        try {
            deffered.await()
        } catch (e: Exception) {
            println(e.localizedMessage)
        }
    }
}