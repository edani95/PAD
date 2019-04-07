package hu.danielelek.android.pad

import dagger.Component
import hu.danielelek.android.pad.ui.UIModule
import hu.danielelek.android.pad.ui.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class])
interface PadApplicationComponent {
    fun inject(mainActivity: MainActivity)
}