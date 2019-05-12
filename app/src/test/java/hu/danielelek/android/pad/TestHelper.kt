package hu.danielelek.android.pad

import hu.danielelek.android.pad.DaggerTestComponent.*
import org.robolectric.RuntimeEnvironment
import org.robolectric.shadows.ShadowLog

val testInjector: TestComponent
    get() {
        ShadowLog.stream = System.out
        val application = RuntimeEnvironment.application as PadApplication
        val component = builder().testModule(TestModule(application.applicationContext)).build()
        application.injector = component
        return component
    }