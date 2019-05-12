package hu.danielelek.android.pad.test

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import hu.danielelek.android.pad.dao.PublicApiDao
import hu.danielelek.android.pad.dao.PublicApiDataBase
import hu.danielelek.android.pad.model.StoredApi
import hu.danielelek.android.pad.testInjector
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class DBTest {

    @Inject
    lateinit var context: Context

    lateinit var publicApiDao: PublicApiDao
    lateinit var publicApi: StoredApi

    @Before
    fun setup() {
        testInjector.inject(this)
        PublicApiDataBase.TEST_MODE = true
        publicApiDao = PublicApiDataBase.getInstance(context)!!.publicApiDataDao()

        publicApi = StoredApi(null, "Cats", "These are cats", "no", "no", "no", "animals")
    }

    @Test
    fun testInsert() {
        publicApiDao.insertPublicApi(publicApi)

        val publicApiTest = publicApiDao.getPublicApis()[0]

        Assert.assertEquals(publicApi.title, publicApiTest.title)
    }

    @Test
    fun testDelete() {
        publicApiDao.deletePublicApi(publicApi)

        var storedApis = publicApiDao.getPublicApis()

        Assert.assertEquals(0, storedApis.size)
    }

    @After
    fun tearDown() {
        PublicApiDataBase.destroyInstance()
    }
}