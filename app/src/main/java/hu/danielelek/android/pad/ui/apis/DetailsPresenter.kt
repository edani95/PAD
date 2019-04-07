package hu.danielelek.android.pad.ui.apis

import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.ui.Presenter
import java.util.concurrent.Executor
import javax.inject.Inject

class DetailsPresenter @Inject constructor(private val executor: Executor, private val apisInteractor: ApisInteractor): Presenter<DetailsScreen>() {

    fun saveChanges(api: Api) {
        TODO("not implemented")
    }
}