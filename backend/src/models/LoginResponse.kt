package pl.adam.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("redirect_to")
    val redirectTo: String,
    @SerializedName("request_url")
    val requestUrl: String,
    val subject: String,
    val skip: Boolean
)
