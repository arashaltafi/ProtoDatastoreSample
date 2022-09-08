package com.arash.altafi.protodatastoresample.repository

import com.arash.altafi.protodatastoresample.model.AppSettings
import com.arash.altafi.protodatastoresample.model.Language
import com.arash.altafi.protodatastoresample.model.User
import kotlinx.coroutines.flow.Flow

interface Abstract {
    suspend fun saveAppSettings(language: Language, user: User)
    suspend fun getAppSettings(): Flow<AppSettings>
}