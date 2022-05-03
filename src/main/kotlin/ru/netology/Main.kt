package ru.netology

fun main() {

    val firstPost = Post(text = "Hello", isFavorite = true)
    val secondPost = Post(text = "Kotlin", isFavorite = false)
    val thirdPost = Post(text = "How", isFavorite = true)
    val fourthPost = Post(text = "You are", isFavorite = true)

    val updatedPost = Post(id = 3, text = "edited text", isFavorite = false)

    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)
    WallService.add(fourthPost)

    WallService.update(updatedPost)
    println(WallService.update(updatedPost))

}