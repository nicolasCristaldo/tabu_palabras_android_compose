package com.nicolascristaldo.tabupalabras.di

import com.nicolascristaldo.tabupalabras.data.providers.CardsProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CardsProviderModule {
    @Provides
    fun provideCardsProvider(): CardsProvider = CardsProvider()
}