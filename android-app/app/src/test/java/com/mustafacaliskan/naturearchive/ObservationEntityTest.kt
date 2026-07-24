package com.mustafacaliskan.naturearchive

import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity
import org.junit.Assert.assertTrue
import org.junit.Test

class ObservationEntityTest {
    @Test
    fun createdAt_defaultsToCurrentTime() {
        val entity = ObservationEntity(
            title = "Trail sighting",
            notes = "An evening walk near the river",
            category = "Wildlife"
        )

        assertTrue(entity.createdAt > 0L)
    }
}
