package com.lj.domain.model

/**
 * Define a message with a [prefix] and a [name].
 */
data class Message (
    val prefix: String,
    val name: String
) {
    /**
     * Format the message: "[prefix] [name]!"
     */
    fun format() = "$prefix $name!"
}
