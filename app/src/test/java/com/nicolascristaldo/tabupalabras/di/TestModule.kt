package com.nicolascristaldo.tabupalabras.di

import com.nicolascristaldo.tabupalabras.data.providers.CardsProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.mockk.mockk

@Module
@InstallIn(SingletonComponent::class)
object TestModule {
    @Provides
    fun provideCardsProvider(): CardsProvider = mockk()
}