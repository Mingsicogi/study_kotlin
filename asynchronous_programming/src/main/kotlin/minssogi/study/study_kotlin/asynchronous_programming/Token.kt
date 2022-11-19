package minssogi.study.study_kotlin.asynchronous_programming

import lombok.ToString
import java.time.LocalDateTime
import java.util.*

@ToString
class Token {

    private var value: String? = null
    private var createAt: LocalDateTime? = null
    private var expireAt: LocalDateTime? = null

    fun createToken(): Token {
        println("Start token generate. It will take 2 seconds.")
        Thread.sleep(2000)

        val token = Token()
        token.value = UUID.randomUUID().toString()
        token.createAt = LocalDateTime.now()
        token.expireAt = token.createAt?.plusDays(7)

        return token
    }

    override fun toString(): String {
        return "value=$value, createAt=$createAt, expireAt=$expireAt"
    }
}