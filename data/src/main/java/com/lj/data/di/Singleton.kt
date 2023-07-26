package com.lj.data.di

import com.lj.data.repository.MessageRepositoryImpl
import com.lj.domain.repository.MessageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Module to inject/provide repositories.
 */
@InstallIn(SingletonComponent::class)
@Module
abstract class Singleton {

    /**
     * Provide the implementation of [MessageRepository].
     */
    @Binds
    abstract fun provideMessageRepository(repository: MessageRepositoryImpl): MessageRepository
}
