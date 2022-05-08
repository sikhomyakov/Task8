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
            attachments = emptyList()))

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
            attachments = emptyList()))

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
            attachments =  listOf(Photo(12, 21, 555, 12, "Photo", 2022_05_12),
                Video(35, 555, "Video file", "Movie", 312, 2022_05_03, 134)))


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
            attachments = emptyList())


        val result = WallService.update(update)

        assertFalse(result)

    }
}