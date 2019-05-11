package hu.danielelek.android.pad.model

import com.google.gson.annotations.SerializedName

data class Api(
    @SerializedName("API")
    var title: String,
    @SerializedName("Description")
    var description: String,
    @SerializedName("Auth")
    var auth: String,
    @SerializedName("HTTPS")
    var https: String,
    @SerializedName("Cors")
    var cors: String,
    @SerializedName("Link")
    var link: String,
    @SerializedName("Category")
    var category: String
) {
}