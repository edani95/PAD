package hu.danielelek.android.pad.model

fun apiToStoredApi(api: Api): StoredApi {
    return StoredApi(id = null, title = api.title, description = api.description, auth = api.auth, https = api.https, cors = api.cors, category = api.category)
}