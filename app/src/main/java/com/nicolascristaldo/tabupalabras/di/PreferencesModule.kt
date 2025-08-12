package com.nicolascristaldo.tabupalabras.di

import android.content.Context
import com.nicolascristaldo.tabupalabras.data.preferences.PreferencesManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Module responsible for providing dependencies related to preferences.
 */
@Module
@InstallIn(SingletonComponent::class)
object PreferencesModule {

    /**
     * Provides a singleton instance of PreferencesManager.
     * @param context The application context.
     * @return An instance of PreferencesManager.
     */
    @Singleton
    @Provides
    fun providePreferencesManager(@ApplicationContext context: Context): PreferencesManager =
        PreferencesManager(context)

}