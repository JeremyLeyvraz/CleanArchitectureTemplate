package com.lj.usecase.di

import com.lj.domain.repository.MessageRepository
import com.lj.domain.usecase.HelloUseCase
import com.lj.usecase.implementation.HelloUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Module to inject/provide use cases.
 */
@InstallIn(SingletonComponent::class)
@Module
class Singleton {

    /**
     * Provide an implementation for [HelloUseCase].
     */
    @Provides
     fun provideHelloUseCase( repository: MessageRepository): HelloUseCase {
      return  HelloUseCaseImpl(repository)
    }
}
