package com.arsenijjke.domain.usecase

import kotlinx.coroutines.flow.Flow

interface BaseUseCase<in Parameter, out Result> {
    suspend operator fun invoke(param: Parameter): Flow<Result>
}