package com.lj.domain.usecase

/**
 * Interface to define a use case that need suspend invocation.
 */
interface SuspendUseCase<Input, Output> {
    /**
     * Invoke the use case.
     */
    suspend fun invoke(input: Input): Output
}