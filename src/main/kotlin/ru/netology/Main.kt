package ru.netology


fun main() {

    val firstPost = Post(
        ownerId = 444,
        fromId = 334,
        createdBy = 555,
        date = 2022_05_08,
        text = "First post",
        likes = 33,
        repost = null,
        views = 99,
        isFavorite = true)

    val secondPost = Post(
        ownerId = 555,
        fromId = 334,
        createdBy = 555,
        date = 2022_05_09,
        text = "Second post",
        likes = 10,
        repost = null,
        views = 49,
        isFavorite = true)

    val updatedPost = Post(
        ownerId = 444,
        fromId = 334,
        createdBy = 555,
        date = 2022_05_09,
        text = "Edited post",
        likes = 47,
        repost = null,
        views = 123,
        isFavorite = true)

    WallService.add(firstPost)
    WallService.add(secondPost)

    WallService.update(updatedPost)
    println(WallService.update(updatedPost))
    WallService.printPosts()
}