package com.example.iself.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "references_table")
data class Reference(
    @PrimaryKey(autoGenerate = true)
    val refId: Long = 0L,
    @ColumnInfo(name="ref_name")
    val name: String,
    @ColumnInfo(name="ref_desc")
    val desc: String = "",
    @ColumnInfo(name="ref_type")
    val type: String = ""
)