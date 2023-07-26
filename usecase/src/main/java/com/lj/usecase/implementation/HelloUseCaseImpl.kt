package com.lj.usecase.implementation

import com.lj.domain.repository.MessageRepository
import com.lj.domain.usecase.HelloUseCase
import javax.inject.Inject

/**
 * [HelloUseCase] implementation:
 * Get a 'Hello message from a [String] using [MessageRepository].
 */
class HelloUseCaseImpl @Inject constructor(private val repository: MessageRepository) : HelloUseCase {
    override fun invoke(input: String): String =
        repository.getMessage("Hello", input).format()
}
