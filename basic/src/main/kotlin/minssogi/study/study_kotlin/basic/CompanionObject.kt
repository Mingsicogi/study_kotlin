package minssogi.study.study_kotlin.basic

import minssogi.study.study_kotlin.basic.Constants.Companion.commonDateFormat

class Constants {

    companion object {
        const val commonDateFormat: String = "yyyymmdd"

    }
}

fun main() {
    println(commonDateFormat)
}