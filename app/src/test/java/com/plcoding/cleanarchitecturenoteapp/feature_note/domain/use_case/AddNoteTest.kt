package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.google.common.truth.Truth
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.repository.FakeNoteRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import com.google.common.truth.Truth.assertThat
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

internal class AddNoteTest{

    private lateinit var addNote: AddNote
    private lateinit var fakeRepository: FakeNoteRepository

    @Before
    fun setUp() {
        fakeRepository = FakeNoteRepository()
        addNote = AddNote(fakeRepository)
    }

    @Test
    fun `Add note without title`() = runBlocking {

        val note = Note("", "Content", 120315, 1)
        assertThat(addNote.invoke(note))

    }

    @Test
    fun `Add note without content`() = runBlocking {

        val note = Note("Title", "", 120315, 1)
        assertThat(addNote.invoke(note))

    }

    @Test
    fun `Add note to repository`() = runBlocking {

        val note = Note("Title", "Content", 120315, 1)
        assertThat(addNote.invoke(note))

    }
}