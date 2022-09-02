package minssogi.study.study_kotlin.basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        println("Hello coroutine")
    }

    Thread.sleep(100)

    println("Main thread finish")


}