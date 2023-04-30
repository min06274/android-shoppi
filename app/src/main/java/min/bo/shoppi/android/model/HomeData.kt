package min.bo.shoppi.android.model

import com.google.gson.annotations.SerializedName
import min.bo.shoppi.android.Banner

data class HomeData(
    val title: Title,
    @SerializedName("top_banners") val topBanners: List<Banner>

)
