package minssogi.study.study_kotlin.basic

fun main() {
    var nullableName: String? = null

    nullableName = "minssogi"

    println("nullableName is ${nullableName?:"Default Name"}")
}