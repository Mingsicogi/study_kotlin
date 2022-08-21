package minssogi.study.study_kotlin.basic

fun main() {

    for (i in 1..10){
        println("[for statement1] $i")
    }

    println()

    for (i in 1..10 step 2){
        println("[for statement2] $i")
    }

    println()

    for (i in 10 downTo 1 step 2){
        println("[for statement2] $i")
    }
}