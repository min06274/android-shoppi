package min.bo.shoppi.android.repository

import min.bo.shoppi.android.model.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {



    fun getHomeData(): HomeData?{

        return assetDataSource.getHomeData()
    }
}