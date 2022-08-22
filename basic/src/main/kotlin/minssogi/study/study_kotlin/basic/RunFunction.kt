package minssogi.study.study_kotlin.basic

fun main() {

    NewCar(80, "minssogi car").run {
        println("car info : car name = ${this.name} | speed = ${this.speed}")
    }
}

class Car(speed: Int, name: String) {
    internal var speed = 0
    internal var name = ""

    init {
        this.speed = speed
        this.name = name
    }
}