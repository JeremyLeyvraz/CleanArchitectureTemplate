package com.lj.data.repository

import com.lj.domain.model.Message
import com.lj.domain.repository.MessageRepository
import javax.inject.Inject

/**
 * [MessageRepository] implementation.
 */
class MessageRepositoryImpl  @Inject constructor() : MessageRepository {

    /**
     * Get a message with a [prefix] and a [name].
     */
    override fun getMessage(prefix: String, name: String) = Message(prefix, name)
}
