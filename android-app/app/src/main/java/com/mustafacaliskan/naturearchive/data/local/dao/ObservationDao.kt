package com.mustafacaliskan.naturearchive.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity

@Dao
interface ObservationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertObservation(observation: ObservationEntity): Long
}
