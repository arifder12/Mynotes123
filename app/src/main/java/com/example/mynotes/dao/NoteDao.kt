package com.example.mynotes.dao

import androidx.room.*
import com.example.mynotes.model.ModelNote

/**
 * Created by Azhar Rivaldi on 6/11/2020.
 */

@Dao
interface NoteDao {
    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNote: List<ModelNote?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(modelNote: ModelNote?)

    @Delete
    fun delete(modelNote: ModelNote?)
}