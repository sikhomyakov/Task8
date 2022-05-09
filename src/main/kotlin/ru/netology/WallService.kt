package ru.netology


object WallService {
    private val posts = ArrayList<Post>()
    private val comments = ArrayList<Comment>()


    fun add(post: Post): Post {
        posts.add(post)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postForEdit) in posts.withIndex()){
            if (postForEdit.id != post.id) continue
            posts[index] = post.copy(ownerId = postForEdit.ownerId, date = postForEdit.date)
            return true
        }
        return false
    }

    fun createComment(comment: Comment) {

        for (post: Post in posts) {
            if (post.id == comment.postId) {
                comments.add(comment)
            } else throw PostNotFoundException("Post not found!")
        }
    }
    fun generateId(): Int {
        return if (posts.isEmpty()) 1 else posts.last().id + 1
    }
}



