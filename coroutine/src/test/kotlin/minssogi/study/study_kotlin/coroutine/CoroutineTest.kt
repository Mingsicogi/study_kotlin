package minssogi.study.study_kotlin.coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class CoroutineTest {
    @Test
    @OptIn(ExperimentalCoroutinesApi::class)
    fun coroutineTest() = runTest {
        val measureTimeMillis = measureTimeMillis {
            println("[${Thread.currentThread().name}] ${getGameList()}")
            sendLog()
        }

        println("measureTimeMillis = $measureTimeMillis")
    }
}

//class TestSample01 {
//    suspend fun fetchData(): String {
//        delay(5000L)
//        return "Hello world"
//    }
//
//    @Test
//    @OptIn(ExperimentalCoroutinesApi::class)
//    fun dataShouldBeHelloWorld() = runTest {
//        val data = fetchData()
//        println(data)
//        Assertions.assertEquals("Hello world", data)
//    }
//}
