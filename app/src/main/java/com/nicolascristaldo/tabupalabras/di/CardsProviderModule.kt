package com.nicolascristaldo.tabupalabras.di

import com.nicolascristaldo.tabupalabras.data.providers.CardsProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CardsProviderModule {
    @Singleton
    @Provides
    fun provideCardsProvider(): CardsProvider = CardsProvider()
}