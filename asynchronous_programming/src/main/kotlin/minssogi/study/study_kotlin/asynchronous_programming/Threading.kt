package minssogi.study.study_kotlin.asynchronous_programming

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

    fun preparePostAsync(callback: (Token) -> Unit) {
        callback.invoke(Token().createToken())
    }

    fun submitPostAsync(token: Token, item: Item, callback: (Post) -> Unit) {
        callback.invoke(Post().submitPost(token, item))
    }
}