package hu.danielelek.android.pad.ui

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.danielelek.android.pad.ui.main.MainPresenter
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter() = MainPresenter()
}