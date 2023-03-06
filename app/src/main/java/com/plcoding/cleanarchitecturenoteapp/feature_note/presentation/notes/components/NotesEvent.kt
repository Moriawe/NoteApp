package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder : NoteOrder) : NotesEvent()
    data class DeleteNote(val note : Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSelection : NotesEvent()
}