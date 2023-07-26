package com.lj.domain.repository

import com.lj.domain.model.Message

/**
 * Interface for the repository dedicated to [Message].
 */
interface MessageRepository {
    /**
     * Get a message with a [prefix] and a [name].
     */
    fun getMessage(prefix:String, name: String): Message
}