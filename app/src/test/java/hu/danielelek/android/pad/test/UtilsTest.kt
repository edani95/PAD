package hu.danielelek.android.pad.test

import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.model.StoredApi
import hu.danielelek.android.pad.model.apiToStoredApi
import hu.danielelek.android.pad.testInjector
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import java.lang.Exception

@RunWith(RobolectricTestRunner::class)
class UtilsTest {

    private lateinit var api: Api

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        api = Api("Cats", "This is a cat", "no", "yes", "no", "http://omg.what.to.write.here.com", "animals")
    }

    @Test
    @Throws(Exception::class)
    fun testApiToStoredApiMethod() {
        var storedApi = apiToStoredApi(api)

        Assert.assertEquals(StoredApi(null, "Cats", "This is a cat", "no", "yes", "no", "animals"), storedApi)
    }

    @After
    fun tearDown() {

    }
}