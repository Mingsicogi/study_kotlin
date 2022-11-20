package minssogi.study.study_kotlin.asynchronous_programming

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Future

class Threading {

    fun postItem(item: Item) {
        val startTime = System.currentTimeMillis()

        val token = Token().createToken()
        val post = Post().submitPost(token, item)
        post.processPost()

        println("postItem function tooks ${System.currentTimeMillis() - startTime}ms totally.")
    }

    fun postItemAsync(item: Item) {
        val startTime = System.currentTimeMillis()

        preparePostAsync { token ->
            submitPostAsync(token, item) { post ->
                post.processPost()
            }
        }


        println("postItemAsync function tooks ${System.currentTimeMillis() - startTime}ms totally.")
    }

    fun postItemFuture(item: Item) {
        val startTime = System.currentTimeMillis()

        preparePostFuture().thenCompose { token ->
            submitPostFuture(token, item)
        }.thenAccept { post -> post.processPost() }

        println("postItemFuture function tooks ${System.currentTimeMillis() - startTime}ms totally.")
    }

    fun preparePostAsync(callback: (Token) -> Unit) {
        callback.invoke(Token().createToken())
    }

    fun submitPostAsync(token: Token, item: Item, callback: (Post) -> Unit) {
        callback.invoke(Post().submitPost(token, item))
    }

    fun preparePostFuture(): CompletableFuture<Token> {
        return CompletableFuture.supplyAsync { Token().createToken() }
    }

    fun submitPostFuture(token: Token, item: Item): CompletableFuture<Post> {
        return CompletableFuture.completedFuture(Post().submitPost(token, item))
    }
}