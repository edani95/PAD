package hu.danielelek.android.pad.mock

import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.model.Entries
import hu.danielelek.android.pad.network.PublicApiApi
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MockPublicApiApi : PublicApiApi {
    override fun getApiEntries(): Call<Entries> {
        var result = Entries()

        result.count = 2
        result.entries = arrayListOf(
            Api("Cats", "No such thing", "", "false", "yes", "-", "animals"),
            Api("Dogs", "No such-such thing", "yes", "yes", "unknown", "-", "animals"))

        var call = object : Call<Entries> {
            @Throws(IOException::class)
            override fun execute(): Response<Entries> {
                return Response.success(result)
            }

            override fun enqueue(callback: Callback<Entries>) {

            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<Entries> {
                return this
            }

            override fun request(): Request? {
                return null
            }
        }

        return call
    }
}