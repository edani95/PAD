package hu.danielelek.android.pad.interactor.apis

import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.network.PublicApiApi
import javax.inject.Inject

class ApisInteractor @Inject constructor(private val publicApiApi: PublicApiApi) {
    fun getApis() : List<Api> {
        val getApisQueryCall = publicApiApi.getApiEntries();
        val response = getApisQueryCall.execute()

        return response.body()!!
    }

    fun getApi(title: String) {
        TODO("not implemented")
    }

    fun saveApi(api: Api) {
        TODO("not implemented")
    }
}