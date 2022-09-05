package minssogi.study.study_kotlin.basic.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var functionCalls = 0

fun main() {
    GlobalScope.launch { completedMessage() }
    GlobalScope.launch { improveMessage() }

    print("Hello, ")

    Thread.sleep(2000)

    println("There have been $functionCalls")
}

suspend fun completedMessage() {
    delay(500)
    print( "World!!")
    functionCalls++
}

suspend fun improveMessage() {
    delay(1000)
    println("Suspend functions are cool")
    functionCalls++
}