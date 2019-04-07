package hu.danielelek.android.pad.ui.apis

import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.ui.Presenter
import java.util.concurrent.Executor
import javax.inject.Inject

class AddApiPresenter @Inject constructor(private val executor: Executor, private val apisInteractor: ApisInteractor): Presenter<AddApiScreen>() {

    fun saveNewApi(api: Api) {
        TODO("not implemented")
    }
}