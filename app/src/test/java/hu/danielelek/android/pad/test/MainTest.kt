package hu.danielelek.android.pad.test

import hu.danielelek.android.pad.interactor.apis.ApisInteractor
import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.model.StoredApi
import hu.danielelek.android.pad.testInjector
import hu.danielelek.android.pad.ui.main.MainPresenter
import hu.danielelek.android.pad.ui.main.MainScreen
import hu.danielelek.android.pad.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import java.lang.Exception
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class MainTest {

    @Inject
    lateinit var mainPresenter: MainPresenter

    private lateinit var mainScreen: MainScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        mainScreen = mock()
        mainPresenter.attachScreen(mainScreen)
    }

    @Test
    @Throws(Exception::class)
    fun testRefreshPublicApiList() {
        mainPresenter.refreshPublicApiList()

        Mockito.verify(mainScreen, Mockito.timeout(5000).atLeastOnce()).refreshApiList(arrayListOf(
            StoredApi(null,"Cats", "No such thing", "", "false", "yes", "animals"),
            StoredApi(null,"Dogs", "No such-such thing", "yes", "yes", "unknown","animals")
        ))
    }

    @After
    fun tearDown() {
        mainPresenter.detachScreen()
    }
}