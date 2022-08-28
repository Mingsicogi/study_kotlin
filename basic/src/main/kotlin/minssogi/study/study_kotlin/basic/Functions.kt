package minssogi.study.study_kotlin.basic


fun main() {
    print("input number1 : ")
    val number1 = readLine()!!.toInt()

    print("input number2 : ")
    val number2 = readLine()!!.toInt()

    println("input data result = ${sum(number1, number2)}")


    print("null data result = ${sum()}")
}

fun sum(num1: Int = 0, num2: Int = 0) {
    print("$num1 + $num2 = ${num1 + num2}")
}

