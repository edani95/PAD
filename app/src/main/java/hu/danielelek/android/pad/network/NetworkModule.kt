package hu.danielelek.android.pad.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() = OkHttpClient()

    @Provides
    @Singleton
    fun providePublicApisApi(client: OkHttpClient) : PublicApiApi {
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl(NetworkConfig.API_ENDPOINT_ADDRESS)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(PublicApiApi::class.java)
    }
}