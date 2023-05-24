package ru.netology.nmedia.ui

import com.google.android.gms.common.GoogleApiAvailability
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class GoogleApiAvailabilityModule {

    @Provides
    fun provideGoogleApiAvailability(): GoogleApiAvailability = GoogleApiAvailability.getInstance()
}
