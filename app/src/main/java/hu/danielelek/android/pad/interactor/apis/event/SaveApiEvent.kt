package hu.danielelek.android.pad.interactor.apis.event

data class SaveApiEvent(
    var code: Int = 0,
    var throwable: Throwable? = null
) {
}