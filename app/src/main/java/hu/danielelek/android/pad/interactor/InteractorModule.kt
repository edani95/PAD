package hu.danielelek.android.pad.interactor

import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.network.PublicApiApi
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun provideApisInteractor(publicApiApi: PublicApiApi) = ApisInteractor(publicApiApi)
}