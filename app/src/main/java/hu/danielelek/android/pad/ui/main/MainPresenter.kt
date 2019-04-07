package hu.danielelek.android.pad.ui.main

import hu.danielelek.android.pad.ui.Presenter

class MainPresenter : Presenter<MainScreen>() {

    fun refreshPublicApiList() {
        screen?.refreshApiList()
    }
}