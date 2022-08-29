package minssogi.study.study_kotlin.basic

import kotlin.random.Random

fun main() {
    val sampleData: String by lazy {
        println("Setting field..")
        "Hello Kotlin"
    }

    if (Random.nextInt() % 2 == 0) {
        println(sampleData)
    }
}