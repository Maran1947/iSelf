package com.example.iself.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.iself.data.Reference

@Dao
interface ReferenceDatabaseDao {

    @Insert
    fun insert(reference: Reference)

    @Update
    fun update(reference: Reference)

    @Query("SELECT * from references_table WHERE ref_type = :type")
    fun get(type: String): Reference?

    @Query("DELETE FROM references_table")
    fun clear()

    @Query("SELECT * FROM references_table ORDER BY refId DESC LIMIT 1")
    fun getLatest(): Reference?

    @Query("SELECT * FROM references_table ORDER BY refId DESC")
    fun getAllReference(): LiveData<List<Reference>>
}