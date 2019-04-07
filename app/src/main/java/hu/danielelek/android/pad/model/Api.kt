package hu.danielelek.android.pad.model

data class Api(
    var title: String? = null,
    var description: String? = null,
    var auth: String? = null,
    var https: String? = null,
    var cors: String? = null,
    var category: String? = null
) {
}