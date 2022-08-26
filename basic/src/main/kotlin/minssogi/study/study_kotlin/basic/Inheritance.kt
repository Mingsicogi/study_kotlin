package minssogi.study.study_kotlin.basic

fun main() {
    val son = Son("Mins", 123)

    son.printPrivacyInfo()
}

class Son(private val name: String, private val age: Int): Mom("Jane", 50) {

    override fun printPrivacyInfo() {
        super.printPrivacyInfo()
        println("Son name: $name, age: $age")
    }
}

open class Mom(private val name: String, private val age: Int) {

    open fun printPrivacyInfo() {
        println("Mom name : $name, age : $age")
    }


}