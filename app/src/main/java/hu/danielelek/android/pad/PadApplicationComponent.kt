package hu.danielelek.android.pad

import dagger.Component
import hu.danielelek.android.pad.interactor.InteractorModule
import hu.danielelek.android.pad.network.NetworkModule
import hu.danielelek.android.pad.ui.UIModule
import hu.danielelek.android.pad.ui.main.MainActivity
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, InteractorModule::class, NetworkModule::class])
interface PadApplicationComponent {
    fun inject(mainActivity: MainActivity)
}