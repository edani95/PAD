package hu.danielelek.android.pad.interactor.apis.event

import hu.danielelek.android.pad.model.Api

data class GetApisEvent(
    var code: Int = 0,
    var apis: List<Api>? = null,
    var throwable: Throwable? = null
) {
}