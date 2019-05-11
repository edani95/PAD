package hu.danielelek.android.pad.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "api")
data class StoredApi(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    @ColumnInfo(name = "title") var title: String?,
    @ColumnInfo(name = "description") var description: String?,
    @ColumnInfo(name = "auth") var auth: String?,
    @ColumnInfo(name = "https") var https: String?,
    @ColumnInfo(name = "cors") var cors: String?,
    @ColumnInfo(name = "category") var category: String?
) {
}