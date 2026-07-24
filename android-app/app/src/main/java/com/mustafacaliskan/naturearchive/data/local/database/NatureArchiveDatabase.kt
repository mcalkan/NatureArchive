package com.mustafacaliskan.naturearchive.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mustafacaliskan.naturearchive.data.local.dao.ObservationDao
import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity

@Database(
    entities = [ObservationEntity::class],
    version = 1,
    exportSchema = false
)
abstract class NatureArchiveDatabase : RoomDatabase() {
    abstract fun observationDao(): ObservationDao

    companion object {
        @Volatile
        private var INSTANCE: NatureArchiveDatabase? = null

        fun getInstance(context: Context): NatureArchiveDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NatureArchiveDatabase::class.java,
                    "nature_archive_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
