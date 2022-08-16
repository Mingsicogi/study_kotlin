package minssogi.study.study_kotlin.basic

import java.lang.Exception

fun main() {
    try {
        var input = readLine()
        println("input is ${input?.toInt()}")
    } catch (e: Exception) {
        println("An exception happened. message is ${e.localizedMessage}")
    }
}