package hu.danielelek.android.pad

import android.app.Application
import hu.danielelek.android.pad.ui.UIModule
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import sun.security.krb5.internal.KDCOptions.with



class PadApplication : Application() {

    lateinit var injector: PadApplicationComponent

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
        injector = DaggerPadApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}