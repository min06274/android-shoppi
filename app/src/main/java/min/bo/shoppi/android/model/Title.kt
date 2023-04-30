package min.bo.shoppi.android.model

import com.google.gson.annotations.SerializedName

data class Title(
    val text:String,
    @SerializedName("icon_url") val iconUrl:String
)
