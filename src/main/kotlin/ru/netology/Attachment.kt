package ru.netology

sealed class Attachment(val type: String)

data class VideoAttachment(val video: Video) : Attachment("video")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class LinkAttachment(val link: Link) : Attachment("link")
data class DocAttachment(val doc: Doc) : Attachment("doc")

class Video(val id: Int, val albumId: Int, val ownerInt: Int, val userId: Int)
class Audio(val id: Int, val albumId: Int, val ownerInt: Int, val userId: Int)
class Photo(val id: Int, val albumId: Int, val ownerInt: Int, val userId: Int)
class Doc(val id: Int, val albumId: Int, val ownerInt: Int, val userId: Int)
class Link(val id: Int, val albumId: Int, val ownerInt: Int, val userId: Int)