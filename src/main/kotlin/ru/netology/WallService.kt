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

        for (i: Int in 0..posts.size) {
            val searchPost = posts[i]
            if (post.id == searchPost.id) {
                val updatedPost = post.copy(
                    id = searchPost.id,
                    ownerId = searchPost.ownerId,
                    date = searchPost.date
                )

                posts[i] = updatedPost

                return true
            }
        }
        return false
    }

    fun printPosts() {
        for ((index, value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
            println("\tвложения:")
            for (att: Attachment in value.attachments) {
                when (att.type) {
                    "Photo" -> println("\t\tPhoto")
                    "Video" -> println("\t\tVideo")
                    else -> println("\t\tunknown")
                }
            }
        }
    }
}