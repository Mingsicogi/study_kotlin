package minssogi.study.study_kotlin.asynchronous_programming

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadingTest {

    @Test
    fun threading_sync() {
        // give
        newLineForPrettyPrint()
        val threading = Threading()

        // when
        threading.postItem(Item("Iphone SE2", 1_000_000))
    }

    @Test
    internal fun threading_async() {
        // give
        newLineForPrettyPrint()
        val threading = Threading()

        // when
        threading.postItemAsync(Item("Iphone SE2", 1_000_000))
    }

    @Test
    internal fun threading_future() {
        // give
        newLineForPrettyPrint()
        val threading = Threading()

        // when
        threading.postItemFuture(Item("Iphone SE2", 1_000_000))

        Thread.sleep(5000)
    }

    private fun newLineForPrettyPrint() {
        println()
        println()
        println()
    }
}


