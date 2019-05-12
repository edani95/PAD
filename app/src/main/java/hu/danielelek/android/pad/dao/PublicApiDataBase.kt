package hu.danielelek.android.pad.dao

import android.content.Context
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import hu.danielelek.android.pad.model.StoredApi

@Database(entities = arrayOf(StoredApi::class), version = 1, exportSchema = false)
abstract class PublicApiDataBase: RoomDatabase() {
    abstract fun publicApiDataDao(): PublicApiDao

    companion object {
        var TEST_MODE = false

        private var INSTANCE: PublicApiDataBase? = null

        fun getInstance(context: Context): PublicApiDataBase? {
            if(INSTANCE == null){
                synchronized(PublicApiDataBase::class) {
                    if(TEST_MODE) {
                        INSTANCE = Room.inMemoryDatabaseBuilder(context.getApplicationContext(), PublicApiDataBase::class.java).allowMainThreadQueries().build()
                    } else {
                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PublicApiDataBase::class.java, "publicapis.db")
                            .build()
            }
        }
            }

            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}