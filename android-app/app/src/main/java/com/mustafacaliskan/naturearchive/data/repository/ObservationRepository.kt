package com.mustafacaliskan.naturearchive.data.repository

import com.mustafacaliskan.naturearchive.data.local.dao.ObservationDao
import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity

class ObservationRepository(
    private val observationDao: ObservationDao
) {
    suspend fun insertObservation(observation: ObservationEntity): Long {
        return observationDao.insertObservation(observation)
    }

    suspend fun getAllObservations(): List<ObservationEntity> {
        return observationDao.getAllObservations()
    }

    suspend fun getObservationById(id: Long): ObservationEntity? {
        return observationDao.getObservationById(id)
    }
}
