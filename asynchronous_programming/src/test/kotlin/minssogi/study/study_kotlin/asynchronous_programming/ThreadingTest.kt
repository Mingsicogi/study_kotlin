package minssogi.study.study_kotlin.asynchronous_programming

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadingTest {

    @Test
    @Disabled
    fun threading_sync() {
        // give
        val threading = Threading()

        // when
        threading.postItem(Item("Iphone SE2", 1_000_000))
    }

    @Test
    fun threading_async() {
        // give
        val threading = Threading()

        // when
        threading.postItemAsync(Item("Iphone SE2", 1_000_000))

        // then
        Thread.sleep(5000)
    }
}


