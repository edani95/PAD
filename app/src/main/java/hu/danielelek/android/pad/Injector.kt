package hu.danielelek.android.pad

import android.app.Activity

val Activity.injector: PadApplicationComponent
    get() {
        return (this.applicationContext as PadApplication).injector
    }