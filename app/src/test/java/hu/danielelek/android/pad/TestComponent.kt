package hu.danielelek.android.pad

import dagger.Component
import hu.danielelek.android.pad.interactor.InteractorModule
import hu.danielelek.android.pad.mock.MockNetworkModule
import hu.danielelek.android.pad.test.DBTest
import hu.danielelek.android.pad.test.MainTest
import hu.danielelek.android.pad.test.UtilsTest
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface TestComponent : PadApplicationComponent {
    fun inject(mainTest: MainTest)
    fun inject(utilsTest: UtilsTest)
    fun inject(dbTest: DBTest)
}