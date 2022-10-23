package com.arsenijjke.domain.repository

import kotlinx.coroutines.flow.Flow
import com.arsenijjke.domain.models.device.Device

interface IrrigationLocalRepository{

    fun addDevice(device: Device)

    fun deleteDevice(device: Device)

    /**
     * Может быть бесполезным
     */
    fun amendDevice(device: Device): Flow<Device>
}