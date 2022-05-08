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
                val updatedPost = Post(searchPost.id,
                    searchPost.ownerId,
                    post.fromId,
                    post.createdBy,
                    searchPost.date,
                    post.text,
                    post.replyOwnerId,
                    post.replyPostId,
                    post.friendsOnly,
                    post.comments,
                    post.copyright,
                    post.likes,
                    post.repost,
                    post.views,
                    post.postType,
                    post.signerId,
                    post.canPin,
                    post.canDelete,
                    post.canEdit,
                    post.isPinned,
                    post.markedAsAds,
                    post.isFavorite,
                    post.postponedId
                )
                posts[posts.indexOf(searchPost)] = updatedPost
                return true
            }
        }
        return false
    }
    fun printPosts() {
        for ((index, value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }
}