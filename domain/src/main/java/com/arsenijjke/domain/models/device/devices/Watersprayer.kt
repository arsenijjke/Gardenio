package com.arsenijjke.domain.models.device.devices

import com.arsenijjke.domain.models.device.Device
import com.arsenijjke.domain.models.device.DeviceInfo

/**
 * Все экземпляры моделей которые сделал имеют лишь придуманные мной же характеристики
 */
data class Watersprayer(
    val info: Device,
    val capacity: Int,
    val pressure: Int,
    val capture_width: Int,
    val spray_height: Int,
) : DeviceInfo by info
