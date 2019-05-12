package hu.danielelek.android.pad.mock

import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.network.PublicApiApi
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class MockNetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() = OkHttpClient()

    @Provides
    @Singleton
    fun providePublicApisApi(): PublicApiApi = MockPublicApiApi()
}