package hu.danielelek.android.pad.ui.apis

interface AddApiScreen {
    fun loadCategories()
    fun showNetworkError(errorMsg: String)
}