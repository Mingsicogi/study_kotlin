package minssogi.study.study_kotlin.coroutine

import kotlinx.coroutines.*
import java.time.LocalDateTime


fun main() = runBlocking {
    println("=========================\n")

    launch {
        doCoroutine_01()
    }
    println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Hello")

    println("=========================\n")
    doCoroutine_02()

    println("=========================\n")
    doCoroutine_03()
}

suspend fun doCoroutine_01() {
    delay(1000)
    println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Coroutine!")
}

suspend fun doCoroutine_02() = coroutineScope {
    launch {
        delay(1000)
        println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Coroutine!")
    }

    println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Hello")
}

suspend fun doCoroutine_03() = coroutineScope {
    launch {
        delay(1000)
        println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Coroutine_01!")
    }

    launch {
        delay(2000)
        println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Coroutine_02!")
    }

    println("[${Thread.currentThread().name} - ${LocalDateTime.now()}] Hello")
}

