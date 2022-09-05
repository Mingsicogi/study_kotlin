package minssogi.study.study_kotlin.basic

fun main() {

    val car1 = InitBlock("Benz")
    println()

    val car2 = InitBlock("BMW", 20)
}

class InitBlock(name: String) {

    constructor(name: String, age: Int) : this(name) {
        println("Constructor $name $age")
    }

    init {
        println("Init Block Initializing...")
    }
}