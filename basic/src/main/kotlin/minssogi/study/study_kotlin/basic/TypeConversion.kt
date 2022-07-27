package minssogi.study.study_kotlin.basic

fun main() {

    // int to long
    val intNumber = 10
    println("${intNumber::class.java}")
    println("${intNumber.toLong()::class.java}")

    // data flooding
    val longNumber = 7_500_000_000
    println("longNumber : $longNumber")
    println("longNumber to int : ${longNumber.toInt()}")

}