package hu.danielelek.android.pad.network

import hu.danielelek.android.pad.model.Api
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PublicApiApi {

    @GET("entries")
    fun getApiEntries() : Call<List<Api>>
}