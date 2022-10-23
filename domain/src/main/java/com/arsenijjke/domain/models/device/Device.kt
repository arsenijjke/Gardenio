package com.arsenijjke.domain.models.device

data class Device(
    override val id: Int,
    override val name: String
): DeviceInfo
