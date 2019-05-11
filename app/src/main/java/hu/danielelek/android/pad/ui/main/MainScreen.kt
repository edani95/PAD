package hu.danielelek.android.pad.ui.main

import hu.danielelek.android.pad.model.StoredApi

interface MainScreen {
    fun refreshApiList(publicApis: List<StoredApi>)
}