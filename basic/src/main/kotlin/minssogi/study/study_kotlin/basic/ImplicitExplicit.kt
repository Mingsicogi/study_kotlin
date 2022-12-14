package minssogi.study.study_kotlin.basic

fun main() {

    // implicit
    val intNumber = 5 // int
    val decimalNumber = 5.99 // decimal
    println("${intNumber::class.java} | ${decimalNumber::class.java}")

    // explicit
    val byteNumber: Byte = 5
    println("${byteNumber::class.java}")

    val shortNumber: Short = 5
    println("${shortNumber::class.java}")

    val longNumber: Long = 5L
    println("${longNumber::class.java}")

    val floatNumber: Float = 0.99f
    println("${floatNumber::class.java}")
}