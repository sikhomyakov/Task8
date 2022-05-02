package ru.netology

import org.junit.Test
import org.junit.Assert.*



class WallServiceTest {

    @Test
    fun add() {

        val result = WallService.add(Post(text = "Hello", isFavorite = true))

        assertTrue(result.id != 0)
    }

    @Test
    fun update_True() {

        WallService.add(Post(text = "Hello", isFavorite = true))
        WallService.add(Post(text = "Kotlin", isFavorite = false))
        WallService.add(Post(text = "How", isFavorite = true))
        WallService.add(Post(text = "You are", isFavorite = true))

        val update = Post(id = 3, text = "edited text", isFavorite = false)

        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun update_False() {

        WallService.add(Post(text = "Hello", isFavorite = true))
        WallService.add(Post(text = "Kotlin", isFavorite = false))
        WallService.add(Post(text = "How", isFavorite = true))
        WallService.add(Post(text = "You are", isFavorite = true))

        val update = Post(id = 5, text = "edited text", isFavorite = false)

        val result = WallService.update(update)

        assertFalse(result)

    }
}