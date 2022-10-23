package com.arsenijjke.domain.models.device.devices

import com.arsenijjke.domain.models.device.Device
import com.arsenijjke.domain.models.device.DeviceInfo

data class Greenhouse(
    val info: Device,
    val plant: String,
    val temperature: Int
) : DeviceInfo by info
