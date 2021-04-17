package com.example.iself.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.iself.dao.ReferenceDatabaseDao
import com.example.iself.data.Reference

@Database(entities = [Reference::class], version = 1, exportSchema = false)
abstract class ReferenceDatabase: RoomDatabase() {

    abstract val referenceDatabaseDao: ReferenceDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE: ReferenceDatabase? = null

        fun getInstance(context: Context): ReferenceDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ReferenceDatabase::class.java,
                        "reference_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}