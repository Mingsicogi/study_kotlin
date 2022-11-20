package minssogi.study.study_kotlin.asynchronous_programming

import java.time.LocalDateTime

class Post {

    private var item: Item? = null
    private var createAt: LocalDateTime? = null

    fun submitPost(token: Token, item: Item): Post {
        println("[${Thread.currentThread().name}] Start submit post")

        println("[${Thread.currentThread().name}] Check token: $token It will take 1 second")
        Thread.sleep(1000)

        val post = Post()
        post.item = item
        post.createAt = LocalDateTime.now()

        return post
    }

    fun processPost() {
        println("[${Thread.currentThread().name}] Start process post. It will take 1 second.")
        Thread.sleep(1000)
        println("[${Thread.currentThread().name}] Post processing finished(post item: $item, createAt: $createAt)")
    }
}
