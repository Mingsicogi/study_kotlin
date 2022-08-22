package minssogi.study.study_kotlin.basic

fun main() {

    NewCar(80, "minssogi car").apply {
        speed = 100
        println("car info : car name = ${this.name} | speed = ${this.speed}")
    }.also {
        println("run function execution complete!!(final car speed = ${it.speed})")
    }
}

class NewCar(speed: Int, name: String) {
    internal var speed = 0
    internal var name = ""

    init {
        this.speed = speed
        this.name = name
    }
}