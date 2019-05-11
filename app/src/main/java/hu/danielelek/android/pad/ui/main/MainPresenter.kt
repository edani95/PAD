package hu.danielelek.android.pad.ui.main

import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.model.StoredApi
import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.model.apiToStoredApi
import hu.danielelek.android.pad.ui.Presenter
import java.util.concurrent.Executor
import javax.inject.Inject

class MainPresenter @Inject constructor(private val executor: Executor, private val apisInteractor : ApisInteractor) : Presenter<MainScreen>() {

    fun refreshPublicApiList() {
        executor.execute {
            var publicApis : ArrayList<StoredApi> = arrayListOf()

            val networkApiList = apisInteractor.getApis()

            networkApiList.forEach { publicApis.add(apiToStoredApi(it)) }

            screen?.refreshApiList(publicApis!!)
        }

    }
}