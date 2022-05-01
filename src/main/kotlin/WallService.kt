package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 1

    fun add(post: Post): Post {
        post.id = lastId++
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {

        for (searchPost in posts) {
            if (post.id == searchPost.id) {
                val updatedPost = Post(searchPost.id, post.text, post.isFavorite)
                posts[posts.indexOf(searchPost)] = updatedPost
                return true
            }
        }
        return false
    }
}