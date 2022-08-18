package minssogi.study.study_kotlin.basic

fun main() {
    // if condition
    println("is it night time?")
    var night: Boolean = readLine()!!.toBoolean()

    if (night) {
        println("Sleep, it's night time")
    } else {
        println("Be active, it's day time")
    }
}