package minssogi.study.study_kotlin.basic

fun main() {
    print("[when statement 1] input animal : ")
    when (val animal = readLine()) {
        "dog" -> {
            println("$animal is cute.")
        }

        "cat" -> {
            println("$animal is cool.")
        }

        else -> {
            println("$animal is not registered animal.")
        }
    }

    print("[when statement 2] input animal : ")
    val printMessage1 = when (val animal = readLine()) {
        "dog" -> "$animal is cute."
        "cat" -> "$animal is cool."
        else -> "$animal is not registered animal."
    }
    println(printMessage1)


    print("[when statement 3] input animal : ")
    val printMessage2 = when (val animal = readLine()) {
        "dog", "rabbit" -> "$animal is cute."
        "cat", "tiger" -> "$animal is cool."
        else -> "$animal is not registered animal."
    }
    println(printMessage2)
}