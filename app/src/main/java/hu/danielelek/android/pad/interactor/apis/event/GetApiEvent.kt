package hu.danielelek.android.pad.interactor.apis.event

import hu.danielelek.android.pad.model.Api

data class GetApiEvent(
    var code: Int = 0,
    var api: Api? = null,
    var throwable: Throwable? = null
) {
}