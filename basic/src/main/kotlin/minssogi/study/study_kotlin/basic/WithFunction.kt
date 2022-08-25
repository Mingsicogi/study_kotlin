package minssogi.study.study_kotlin.basic

import java.lang.StringBuilder

fun main() {
    var sampleFunc = with(StringBuilder()){
        for (i in 1..100) {
            if (i % 2 == 0) {
                append(i)
                append(",")
            }
        }

        toString()
    }
    print(sampleFunc)
}