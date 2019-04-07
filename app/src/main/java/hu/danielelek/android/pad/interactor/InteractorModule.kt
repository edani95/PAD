package hu.danielelek.android.pad.interactor

import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun provideApisInteractor() = ApisInteractor()
}