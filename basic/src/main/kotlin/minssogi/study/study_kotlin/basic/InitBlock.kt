package minssogi.study.study_kotlin.basic

fun main() {

    val car1 = InitBlock("HI")
    println()

    val car2 = InitBlock("HI", 20)
}

class InitBlock(name: String) {

    val model = "BMW"
    val topSpeed = 100

    constructor(name: String, age: Int) : this(name) {
        println("Constructor $name $age")
    }

    init {
        println("Init Block Initializing...")
    }
}