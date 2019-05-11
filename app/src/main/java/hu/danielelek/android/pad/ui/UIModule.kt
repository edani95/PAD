package hu.danielelek.android.pad.ui

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.ui.main.MainPresenter
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, apisInteractor: ApisInteractor) = MainPresenter(executor, apisInteractor)

    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)
}