package minssogi.study.study_kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    println("[${Thread.currentThread().name}] Start Main")
    val measureTimeMillis = measureTimeMillis {
        coroutineScope {
            val getGameListJob = async { getGameList() }
            sendLog()

            println("[${Thread.currentThread().name}] Get game list ${getGameListJob.await()}")
        }
    }

    println("[${Thread.currentThread().name}] measureTimeMillis = $measureTimeMillis")
    println("[${Thread.currentThread().name}] Finish Main")
}

suspend fun getGameList(): String {
    println("[${Thread.currentThread().name}] Start get game list from integ-api")
    delay(4000)
    return "UWO, UD, UDG"
}

suspend fun sendLog() {
    coroutineScope {
        launch {
            delay(1000)
            println("[${Thread.currentThread().name}] Log send success")
        }
    }
}