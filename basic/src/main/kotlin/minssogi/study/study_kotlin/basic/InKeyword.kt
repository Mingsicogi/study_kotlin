package minssogi.study.study_kotlin.basic

fun main() {

    val numbers = 1..100

    val checkNumber = readLine()!!.toInt()
    if (checkNumber in numbers) {
        println("$checkNumber is in $numbers")
    } else {
        println("$checkNumber is not in $numbers")
    }
}