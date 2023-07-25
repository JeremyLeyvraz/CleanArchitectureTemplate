package com.lj.domain.usecase

/**
 * Interface to define a use case.
 */
interface UseCase<Input, Output> {
    /**
     * Invoke the use case.
     */
    fun invoke(input: Input): Output
}
