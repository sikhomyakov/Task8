package ru.netology

data class Post(
    var id: Int = 1,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: String = " ",
    val copyright: String = " ",
    val likes: Int?,
    val repost: Post?,
    val views: Int?,
    val postType: String = " ",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean= false,
    val canEdit: Boolean= false,
    val isPinned: Boolean= false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean,
    val postponedId: Int =0
)