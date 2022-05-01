package ru.netology


// для быстрой проверки работоспособности кода, большую часть полей закомментил

data class Post(
    internal var id: Int = 0,
//    val ownerId: Int,
//    val fromId: Int,
//    val createdBy: Int,
//    val date: Int,
    val text: String,
//    val replyOwner8Id: Int,
//    val replyPostId: Int,
//    val friendsOnly: Boolean,
//    val comments: Objects,
//    val copyright: String,
//    val likes: Int,
//    val repost: Objects,
//    val views: Objects,
//    val postType: String,
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
    val isFavorite: Boolean,
//    val postponedId: Int
) {
}