package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNote,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote,
)
