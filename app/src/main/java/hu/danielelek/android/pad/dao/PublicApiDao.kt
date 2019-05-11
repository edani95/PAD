package hu.danielelek.android.pad.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import hu.danielelek.android.pad.model.StoredApi

@Dao
interface PublicApiDao {
    @Query("""SELECT * FROM api""")
    fun getPublicApis(): List<StoredApi>

    @Insert(onConflict = REPLACE)
    fun insertPublicApi(api: StoredApi)

    @Delete
    fun deletePublicApi(api: StoredApi)
}