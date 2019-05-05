package hu.danielelek.android.pad.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy.REPLACE
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