package com.arsenijjke.domain.repository

import kotlinx.coroutines.flow.Flow
import com.arsenijjke.domain.models.Condition

interface IrrigationRemoteRepository {

    /**
     * Отправить сигнал на сервер вручную
     */
    suspend fun activateSprayer()

    /**
     * Получить состояние из теплицы
     */
    suspend fun getCondition(): Flow<Condition>
}