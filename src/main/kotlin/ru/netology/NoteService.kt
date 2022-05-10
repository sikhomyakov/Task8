package ru.netology

object NoteService {
    var notesList: MutableList<Note> = mutableListOf()


    fun generateId(): Int {
        return if (notesList.isEmpty()) 1 else notesList.last().id + 1
    }

    fun createComment(noteId: Int, comment: Comment): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                note.comments.add(comment)
                isTrue = true
            }
        }
        return isTrue
    }

    fun deleteComment(noteId: Int, commentId: Int): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                for (comment in note.comments) {
                    if (commentId == comment.id) {
                        comment.isDelete = true
                        isTrue = true
                    }
                }
            }
        }
        return isTrue
    }

    fun editComment(noteId: Int, commentId: Int, commentText: String): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                for (comment in note.comments) {
                    if (commentId == comment.id) {
                        comment.text = commentText
                        isTrue = true
                    }
                }
            }
        }
        return isTrue
    }

    fun restoreComment(noteId: Int, commentId: Int): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                for (comment in note.comments) {
                    if (commentId == comment.id) {
                        comment.isDelete = true
                        isTrue = true
                    }
                }
            }
        }
        return isTrue
    }

    fun addNote(note: Note): MutableList<Note> {
        notesList.add(note)
        return notesList
    }

    fun deleteNote(noteId: Int): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                note.isDelete = true
                isTrue = true
            }
        }
        return isTrue
    }

    fun editNote(noteId: Int, newNote: Note): Boolean {
        var isTrue = false
        for (note in notesList) {
            if (noteId == note.id) {
                note.title = newNote.title
                note.text = newNote.text
                isTrue = true
            }
        }
        return isTrue
    }
}