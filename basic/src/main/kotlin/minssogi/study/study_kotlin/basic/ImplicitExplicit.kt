package minssogi.study.study_kotlin.basic

fun main() {

    // implicit
    val intNumber = 5 // int
    val decimalNumber = 5.99 // decimal
    println("${intNumber::class.java} | ${decimalNumber::class.java}")

    // explicit
    val shortNumber: Byte = 5
    println("${shortNumber::class.java}")
}