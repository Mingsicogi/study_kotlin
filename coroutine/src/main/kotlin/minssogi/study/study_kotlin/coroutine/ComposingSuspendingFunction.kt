package minssogi.study.study_kotlin.coroutine

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    var answer = 0
    val time = measureTimeMillis {
//        val one = async { doSomethingUsefulOne() }
//        val two = async { doSomethingUsefulTwo() }
        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }

        println("doSomethingUseful function start")
        one.start()
        two.start()

        answer = one.await() + two.await()
        println("doSomethingUseful function finish")
    }

    println("The answer is $answer")
    println("It tooks $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    println("doSomethingUsefulOne")
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("doSomethingUsefulTwo")
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}