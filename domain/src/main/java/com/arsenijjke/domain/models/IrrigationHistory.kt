package com.arsenijjke.domain.models

import java.time.LocalDate
import java.time.LocalTime

data class IrrigationHistory(
    val id: Int,
    val date: LocalDate,
    val time: LocalTime
)
