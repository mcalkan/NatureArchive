package com.mustafacaliskan.naturearchive.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity

@Dao
interface ObservationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertObservation(observation: ObservationEntity): Long

    @androidx.room.Query("SELECT * FROM observations ORDER BY createdAt DESC")
    suspend fun getAllObservations(): List<ObservationEntity>

    @androidx.room.Query("SELECT * FROM observations WHERE id = :id")
    suspend fun getObservationById(id: Long): ObservationEntity?
}
