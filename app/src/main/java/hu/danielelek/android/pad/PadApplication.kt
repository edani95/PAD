package hu.danielelek.android.pad

import android.app.Application
import hu.danielelek.android.pad.ui.UIModule

class PadApplication : Application() {

    lateinit var injector: PadApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerPadApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}