package com.arsenijjke.domain.repository

import com.arsenijjke.domain.models.IrrigationHistory
import kotlinx.coroutines.flow.Flow

interface IrrigationHistoryRepository {

    fun getIrrigationHistory(): Flow<List<IrrigationHistory>>
}