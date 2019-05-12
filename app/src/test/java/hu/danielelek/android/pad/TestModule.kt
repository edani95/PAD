package hu.danielelek.android.pad

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.ui.main.MainPresenter
import hu.danielelek.android.pad.utils.UiExecutor
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, apisInteractor: ApisInteractor) = MainPresenter(executor, apisInteractor)

    @Provides
    @Singleton
    fun networkExecutor(): Executor = UiExecutor()
}