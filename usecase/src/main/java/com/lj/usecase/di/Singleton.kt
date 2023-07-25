package com.lj.usecase.di

import com.lj.domain.usecase.HelloUseCase
import com.lj.usecase.implementation.HelloUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Module to inject/provide use cases.
 */
@InstallIn(SingletonComponent::class)
@Module
abstract class Singleton {

    /**
     * Provide an implementation for [HelloUseCase].
     */
    @Binds
    abstract fun provideHelloUseCase(useCase: HelloUseCaseImpl): HelloUseCase
}
