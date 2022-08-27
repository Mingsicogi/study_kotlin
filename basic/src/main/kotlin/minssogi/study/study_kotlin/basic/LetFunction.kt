package minssogi.study.study_kotlin.basic

fun main() {

    val numbers = 1..100

    numbers.filter { it % 2 == 0 }
            .map { it * 2 }
            .let { println("$it") }
}