package com.nicolascristaldo.tabupalabras.data.preferences

import android.content.Context
import androidx.core.content.edit

/**
 * Class responsible for managing app preferences.
 * @param context The application context.
 */
class PreferencesManager(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("AppPreferences", Context.MODE_PRIVATE)

    /**
     * Checks if the tutorial has been shown.
     */
    fun isTutorialShown(): Boolean = sharedPreferences.getBoolean("tutorial_shown", false)

    /**
     * Sets the tutorial as shown.
     */
    fun setTutorialShown() {
        sharedPreferences.edit { putBoolean("tutorial_shown", true) }
    }
}