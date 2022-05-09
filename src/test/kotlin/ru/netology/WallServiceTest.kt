package ru.netology

import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        val result = WallService.add(Post(
            ownerId = 444,
            fromId = 334,
            createdBy = 555,
            date = 2022_05_08,
            text = "First post",
            likes = 33,
            repost = null,
            views = 99,
            isFavorite = true,
            attachments = PhotoAttachment,
            comments = emptyList()))

        assertTrue(result.id != 0)
    }

    @Test
    fun update_True() {

        WallService.add(Post(
            ownerId = 444,
            fromId = 334,
            createdBy = 555,
            date = 2022_05_08,
            text = "First post",
            likes = 33,
            repost = null,
            views = 99,
            isFavorite = true,
            comments = emptyList(),
            attachments = emptyList())
        )

        val update = Post(
            id = 1,
            ownerId = 444,
            fromId = 334,
            createdBy = 555,
            date = 2022_05_09,
            text = "Edited post",
            likes = 47,
            repost = null,
            views = 123,
            isFavorite = true,
            comments = emptyList(),
            attachments = VideoAttachment)


        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun update_False() {

        WallService.add(Post(
            ownerId = 444,
            fromId = 334,
            createdBy = 555,
            date = 2022_05_08,
            text = "First post",
            likes = 33,
            repost = null,
            views = 99,
            isFavorite = true,
            comments = emptyList(),
            attachments = emptyList()))


        val update = Post(
            id = 2,
            ownerId = 444,
            fromId = 334,
            createdBy = 555,
            date = 2022_05_08,
            text = "Edited post",
            likes = 33,
            repost = null,
            views = 99,
            isFavorite = true,
            comments = emptyList(),
            attachments = emptyList())


        val result = WallService.update(update)

        assertFalse(result)

    }
}