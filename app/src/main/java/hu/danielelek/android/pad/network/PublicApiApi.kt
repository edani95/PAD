package hu.danielelek.android.pad.network

import hu.danielelek.android.pad.model.Entries
import retrofit2.Call
import retrofit2.http.GET

interface PublicApiApi {

    @GET("entries")
    fun getApiEntries() : Call<Entries>
}