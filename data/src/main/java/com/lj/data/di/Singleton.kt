package com.lj.data.di

import com.lj.data.repository.MessageRepositoryImpl
import com.lj.domain.repository.MessageRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Module to inject/provide repositories.
 */
@InstallIn(SingletonComponent::class)
@Module

class Singleton {

    /**
     * Provide the implementation of [MessageRepository].
     */
    @Provides
    @Singleton
    fun provideMessageRepository(): MessageRepository{
        return MessageRepositoryImpl()
    }
}
