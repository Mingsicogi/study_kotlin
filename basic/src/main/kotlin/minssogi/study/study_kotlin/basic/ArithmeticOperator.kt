package minssogi.study.study_kotlin.basic

fun main() {
    val number: Int? = 10

    val operatorNumber = 3

    println("$number + $operatorNumber = ${number?.plus(operatorNumber)}")
    println("$number - $operatorNumber = ${number?.minus(operatorNumber)}")
    println("$number * $operatorNumber = ${number?.times(operatorNumber)}")
    println("$number / $operatorNumber = ${number?.div(operatorNumber)}")
    println("$number % $operatorNumber = ${number?.rem(operatorNumber)}")
}