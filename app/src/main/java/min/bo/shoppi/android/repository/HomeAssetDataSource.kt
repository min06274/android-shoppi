package min.bo.shoppi.android.repository

import com.google.gson.Gson
import min.bo.shoppi.android.AssetLoader
import min.bo.shoppi.android.model.HomeData

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()



    override fun getHomeData(): HomeData? {

        return assetLoader.getJsonString("home.json")?.let{ homeJsonString->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }

    }

}