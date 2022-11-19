package minssogi.study.study_kotlin.asynchronous_programming

import java.time.LocalDateTime

class Post {

    private var item: Item? = null
    private var createAt: LocalDateTime? = null

    fun submitPost(token: Token, item: Item): Post {
        println("Start submit post")

        println("Check token: $token It will take 1 second")
        Thread.sleep(1000)

        val post = Post()
        post.item = item
        post.createAt = LocalDateTime.now()

        return post
    }

    fun processPost() {
        println("Start process post. It will take 1 second.")
        Thread.sleep(1000)
        println("Post processing finished(post item: $item, createAt: $createAt)")
    }
}
