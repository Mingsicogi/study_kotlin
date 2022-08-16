package minssogi.study.study_kotlin.basic

fun main() {
    var name: String = "minssogi"
    println("name is $name")

    // compilation error
    // name = null

    var nullableName: String? = "minssogi"
    println("nullable name is $nullableName")

    nullableName = null
    println("nullable name is $nullableName")
    println("length of nullable name is ${nullableName?.length}")
}
