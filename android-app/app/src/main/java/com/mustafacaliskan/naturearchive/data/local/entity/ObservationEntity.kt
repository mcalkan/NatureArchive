package com.mustafacaliskan.naturearchive.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "observations")
data class ObservationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val notes: String,
    val category: String,
    val createdAt: Long = System.currentTimeMillis()
)
