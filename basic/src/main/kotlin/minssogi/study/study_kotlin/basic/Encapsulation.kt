package minssogi.study.study_kotlin.basic

open class Airplane {
    val type = "Air bus"

    fun fly() {
        println("flying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar {
    fun start() {
        var airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}