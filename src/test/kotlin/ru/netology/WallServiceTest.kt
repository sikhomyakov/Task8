package ru.netology

import org.junit.Test
import org.junit.Assert.*

import ru.netology.WallService.generateId

class WallServiceTest {

    private fun getTestPost(): Post {
        return Post(
            id = generateId(),
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "Post text",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = emptyArray<Comment>(),
            copyright = "Copyright",
            likes = 0,
            repost = 0,
            views = 0,
            postType = "Post type",
            attachments = emptyArray<Attachment>(),
            signerId = 0,
            copyHistory = "History",
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut,
            postponedId = 0
        )
    }

    @Test
    fun add() {
        var post = getTestPost()
        post = WallService.add(post)
        assertNotEquals(0, post.id)
    }

    @Test
    fun update_True() {
        val testPost = getTestPost()
        WallService.add(testPost.copy())
        val result = WallService.update(testPost.copy(id = 1))
        assertEquals(true, result)
    }

    @Test
    fun update_False() {
        val testPost = getTestPost()
        WallService.add(testPost.copy())
        val result = WallService.update(testPost.copy(id = 10))
        assertEquals(false, result)
    }

    @Test
    fun createComment() {
        var post = getTestPost()
        post = WallService.add(post)
        WallService.createComment(Comment(
            1, post.id, 555, 123, "Comment",
            Donut, false, 0, 0,
            emptyArray<Attachment>()))
//        assertTrue(result)
        assertNotEquals(0, post.id)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val testPost = getTestPost()
        WallService.add(testPost.copy())
        WallService.createComment(Comment(
            1, 444, 555, 123, "Comment",
            Donut, false, 0, 0,
            emptyArray<Attachment>()))
    }
}

