package minssogi.study.study_kotlin.basic

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

var total: Int = 0

fun main() {
    runBlocking {
        val randomInt1 = async { getRandomValue("randomInt1", 1500) }
        val randomInt2 = async { getRandomValue("randomInt2", 3000) }

        val start = System.currentTimeMillis()
        total += randomInt1.await()
        total += randomInt2.await()
        val end = System.currentTimeMillis()

        println("Total random value = $total | takes time = ${(end - start)/1000.0}")
    }
}

suspend fun getRandomValue(callName: String, delayTime: Long): Int {
    val randomValue = Random(delayTime).nextInt(0, 10000)
    println("$callName => delay $delayTime...")
    delay(delayTime)

    println("$callName => get random value $randomValue")
    return randomValue
}