package minssogi.study

import kotlinx.coroutines.*
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

val client = HttpClient.newBuilder().build()

fun main() {
    runBlocking {
        val start = System.currentTimeMillis()

        val gameInfo = async (Dispatchers.IO) { getGameInfo() }
        val characterInfo = async (Dispatchers.IO) { getCharacterInfo() }
        val paymentInfo = async (Dispatchers.IO) { getPaymentInfo() }

        println(gameInfo.await())
        println(characterInfo.await())
        println(paymentInfo.await())

        println("It tooks ${(System.currentTimeMillis() - start) / 1000.0}")
    }
}


suspend fun getGameInfo(): String {
    return coroutineScope {
        get("http://127.0.0.1:8080/api/sample/game/getGameInfo")
    }
}

suspend fun getCharacterInfo(): String {
    return coroutineScope {
        get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo")
    }
}

suspend fun getPaymentInfo(): String {
    return coroutineScope {
        get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo")
    }
}

fun get(uri: String): String {
    return client.send(HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build(), HttpResponse.BodyHandlers.ofString()).body()
}

